package practice;

import io.restassured.path.json.JsonPath;
import org.openjdk.nashorn.api.scripting.ScriptObjectMirror;
import org.testng.collections.Lists;
import org.testng.collections.Maps;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class fetchingPayload {
    static JsonPath jsonPath;
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
        engine.eval(new BufferedReader(new InputStreamReader(Objects.requireNonNull(fetchingPayload.class.getResourceAsStream("/javaScript/demo.js")))));
        Invocable invocable = (Invocable) engine;
        Object object = invocable.invokeFunction("naveen", "bandi");

        Object jO = cToJ(object);
        List<?> l = convertObjectToList(jO);

//        System.out.println(l.get(0).toString());
//        System.out.println(l.get(1).toString());

         jsonPath = new JsonPath(l.get(0).toString());

        Map<Object, Object> addList = jsonPath.getMap("AdditionalInfo");

        Map<Object, Object> productDetails = new HashMap<>(addList);
        productDetails.putAll(addList);

        System.out.println(addList.get("ADIE"));
        jsonPath = new JsonPath(String.valueOf(addList.get("ADIE[0]")));

        System.out.println(Optional.ofNullable(jsonPath.get("PRD_PORT_MM-ATT_INTERFACE")));
//        Set list = addList.keySet();
//
//        for (Object p : list) {
//
//            System.out.println(addList.get(p));
//        }

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

    public static Object cToJ(Object so) {
        if (so instanceof ScriptObjectMirror) {
            ScriptObjectMirror scriptObjectMirror = (ScriptObjectMirror) so;
            if (scriptObjectMirror.isArray()) {
                List<Object> list = Lists.newArrayList();
                for (Map.Entry<String, Object> entry : scriptObjectMirror.entrySet()) {
                    list.add(cToJ(entry.getValue()));
                }
                return list;
            } else {
                Map<String, Object> map = Maps.newHashMap();
                for (Map.Entry<String, Object> entry : scriptObjectMirror.entrySet()) {
                    map.put(entry.getKey(), cToJ(entry.getValue()));
                }
                return map;
            }
        } else {
            return so;
        }
    }
}
