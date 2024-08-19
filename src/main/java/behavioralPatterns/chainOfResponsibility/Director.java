package behavioralPatterns.chainOfResponsibility;

public class Director {
    public static void main(String[] args) {
        Notifier initialTesting = new InitialReadinessLevelDepartment(ReadinessLevel.initialReadinessLevel);
        Notifier averageTesting = new AverageReadinessLevelDepartment(ReadinessLevel.averageReadinessLevel);
        Notifier finalTesting = new FinalReadinessLevelDepartment(ReadinessLevel.finalReadinessLevel);

        initialTesting.setNextNotifier(averageTesting);
        averageTesting.setNextNotifier(finalTesting);

        initialTesting.notifyManager("Лада поступает на проверку начального уровня.", ReadinessLevel.initialReadinessLevel);
        initialTesting.notifyManager("Нива поступает на проверку срднего уровня.", ReadinessLevel.averageReadinessLevel);
        initialTesting.notifyManager("Уаз поступает на полную проверку перед реализацией.", ReadinessLevel.finalReadinessLevel);
    }
}
