package towerdefense;

public class Level {
    int level;
    int spawnSpeed;
    int enemiesPerWaveUp;
    int numWave;
    int newWaveSpeed;
    int startEnemies; 


    public Level(int l) {
        switch (l) {
            case 1:
                startEnemies = 10;
                enemiesPerWaveUp = 3;
                spawnSpeed = 600;
                numWave = 1;
                newWaveSpeed = 3000;
                break;
            case 2:
                startEnemies = 7;
                enemiesPerWaveUp = 4;
                spawnSpeed = 500;
                numWave = 2;
                newWaveSpeed = 7500;
                break;
            case 3:
                startEnemies = 9;
                enemiesPerWaveUp = 5;
                spawnSpeed = 400;
                numWave = 2;
                newWaveSpeed = 7500;
                break;
        }
    }

}
