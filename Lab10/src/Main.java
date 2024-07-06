public class Main {
    public static void main(String[] args) {

        ToshibaBattery[] toshibaBatteries = new ToshibaBattery[5];
        toshibaBatteries[0] = new ToshibaBattery(3.0, 1.5, 5000, 1000);
        toshibaBatteries[1] = new ToshibaBattery(3.2, 1.4, 4500, 900);
        toshibaBatteries[2] = new ToshibaBattery(3.1, 1.6, 4700, 950);
        toshibaBatteries[3] = new ToshibaBattery(3.3, 1.3, 4800, 800);
        toshibaBatteries[4] = new ToshibaBattery(3.0, 1.5, 5000, 1000);

        DuracellBattery[] duracellBatteries = new DuracellBattery[5];
        duracellBatteries[0] = new DuracellBattery(3.0, 1.5, 6000, 2.0);
        duracellBatteries[1] = new DuracellBattery(3.2, 1.4, 5500, 1.8);
        duracellBatteries[2] = new DuracellBattery(3.1, 1.6, 5800, 1.9);
        duracellBatteries[3] = new DuracellBattery(3.3, 1.3, 5900, 2.1);
        duracellBatteries[4] = new DuracellBattery(3.0, 1.5, 6000, 2.0);

        FlashLight[] flashLights = new FlashLight[5];
        flashLights[0] = new FlashLight(new Battery[]{toshibaBatteries[0], duracellBatteries[0]});
        flashLights[1] = new FlashLight(new Battery[]{toshibaBatteries[1], duracellBatteries[1]});
        flashLights[2] = new FlashLight(new Battery[]{toshibaBatteries[2], duracellBatteries[2]});
        flashLights[3] = new FlashLight(new Battery[]{toshibaBatteries[3], duracellBatteries[3]});
        flashLights[4] = new FlashLight(new Battery[]{toshibaBatteries[4], duracellBatteries[4]});

        for (int i = 0; i < flashLights.length; i++) {
            System.out.println("Flashlight " + (i + 1) + " lifetime: " + flashLights[i].getTotalLifeTime());
        }
        FlashLight maxLifeTimeFlashLight = flashLights[0];
        for (FlashLight flashLight : flashLights) {
            if (flashLight.getTotalLifeTime() > maxLifeTimeFlashLight.getTotalLifeTime()) {
                maxLifeTimeFlashLight = flashLight;
            }
        }
        System.out.println("Flashlight with maximum lifetime: " + maxLifeTimeFlashLight.getTotalLifeTime());
    }
}
