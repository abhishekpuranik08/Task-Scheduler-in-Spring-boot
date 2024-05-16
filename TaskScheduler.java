public class RunSchedule {

    @Autowired
    AssetService assetService;

    @Autowired
    EmployeeService employeeService;


   @Scheduled(cron = "${spring.schedule.everyDay1}")
    public void runScheularForAssetAndEmployeeInfo() throws InterruptedException {
              assetService.saveAssetData();
        System.out.println("Schedular is working for Asset");
        employeeService.saveEmployeeViewData();
        System.out.println("Schedular is working for Employee");
    }
}
