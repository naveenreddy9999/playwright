1. create maven project
2. add playwright dependency

steps
1. Initialize playwright connection
   Playwright playwright = Playwright.create();
   
2. Initialize Browser
   Browser browser = playwright.chromium().launch();
note: By default it will execute headless mode
   if we need to execute without headless mode follow below steps
   1.add parameter in launch method
     launch(new BrowserType.LaunchOptions.setHeadless(false));
 
3. Browser maximize
   logic1:
  BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1900,937));
   
  logic2:
  ArrayList<String> arguments = new ArrayList<>();
  arguments.add("--start-maximized");
  Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false).setArgs(arguments));
  BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
   
4. if we need to launch any webpage 
  Page page = browserContext.newPage();
   page.navegate("enteruURL");
   
5. how getTitle
  page.title() 
   return type is string
   
6. set local chrome paths
   Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions.setHeadless(false).setExecutablePath(Paths.get("/chrome.exe")));
   simlarly edge also
   
7. navigation methods
   page.navigate("https://mvnrepository.com/artifact/com.microsoft.playwright/playwright/");
   page.goBack(new Page.GoBackOptions().setTimeout(500));
   page.goForward(new Page.GoForwardOptions().setTimeout(500));
   page.reload();
   
8. incognitomode
   BrowserContext browserContext= playwright.chromium().launchPersistentContext(Paths.get("C:\\Users\\NAVEBAND\\AppData\\Local\\Google\\Chrome\\User Data\\Default"),new BrowserType.LaunchPersistentContextOptions().setHeadless(false).setExecutablePath(Paths.get("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe")));
   Page page = browserContext.newPage();
   
9 channel
  if we are executing chromium we can arrange\
  setChannel()
  Chrome = chrome
  EDGE = msedge

