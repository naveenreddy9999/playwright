package utilities;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.openjdk.nashorn.api.scripting.ScriptObjectMirror;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ScriptReader {

    private static ScriptReader scriptReader=null;

    private ScriptReader(){}

    public static ScriptReader getInstance(){
        if(scriptReader == null){
            scriptReader = new ScriptReader();
        }
        return scriptReader;
    }

    public String getScriptDetails(String filePath, String functionName, String name, String job){
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        Object object = null;
        try {
            engine.eval(new BufferedReader(new InputStreamReader(Objects.requireNonNull(ScriptReader.class.getResourceAsStream("/"+filePath+".js")))));
            Invocable invocable = (Invocable) engine;
            object = invocable.invokeFunction(functionName, name,job);
        } catch (ScriptException | NoSuchMethodException exception) {
            throw new RuntimeException(exception);
        }
        return object.toString();
    }

    public static List<?> convertObjectToList(Object object) {
        List<?> list = new ArrayList<>();
        if (object.getClass().isArray()) {
            list = List.of(object);
        } else if (object instanceof Collection) {
            list = new ArrayList<>((Collection<?>) object);
        }
        return list;
    }

    public static Object convertToJavaObject(Object object) {
        if (object instanceof ScriptObjectMirror scriptObjectMirror) {
            if (scriptObjectMirror.isArray()) {
                List<Object> list = Lists.newArrayList();
                for (Map.Entry<String, Object> entry : scriptObjectMirror.entrySet()) {
                    list.add(convertToJavaObject(entry.getValue()));
                }
                return list;
            } else {
                Map<String, Object> map = Maps.newHashMap();
                for (Map.Entry<String, Object> entry : scriptObjectMirror.entrySet()) {
                    map.put(entry.getKey(), convertToJavaObject(entry.getValue()));
                }
                return map;
            }
        } else {
            return object;
        }
    }
}
