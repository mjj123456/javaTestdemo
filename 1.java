public class controller {
//&&&&&&&&&&&&&&&&&&&&&&&&7
    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.speakHello(name);
    }
}
