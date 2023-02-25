package main;

public class ComputerService {
    private final PowerSupplyService powerSupplyService = new PowerSupplyService();
    private final FanService fanService = new FanService();
    private final BiosService biosService = new BiosService();
    private final OsService osService = new OsService();

    public void start() {
        System.out.println("Запуск компьютера");
        powerSupplyService.checkPowerSupply();
        fanService.runFan();
        biosService.runBios();
        osService.startOs();
    }

    public void stop() {
        System.out.println("Выключение компьютера");
        osService.stopOs();
        fanService.stopFan();
    }
}
