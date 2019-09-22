public class controller {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.speakHello(name);
    }
}