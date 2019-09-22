public class controller {
//&&&&&&&&&&&&&&&&&&&&&&&&7
    @Reference
    private HelloService helloService;

	//修改了这行代码
    @RequestMapping("/hello")
    public String hello(String name) {
        return helloService.speakHello(name);
    }
	
	
	//添加了单点登录功能
}
