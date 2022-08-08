import java.util.Scanner;

public class Rainbow {
    public static void main(String[] args) {
        System.out.println("Привет!\n Меня зовут бот Макс)\n Сыграем в игру?");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "Да", "yes", "Yes", "да", "давай", "Давай", "ок", "ну давай", "конечно", "конечно давай","конечно да", "хорошо":
                    System.out.println("Скажите мне цифру от 1 до 7, а я тебе цвет радуги!\nПогнали:");
                    break;
            case "Нет", "нет", "no", "No", "не надо":// add "no", "не надо"
                System.out.println("Не хотите- как хотите. Хорошего дня!");
                return;
            default:System.out.println("Извините, но я не смог идентифицировать то, что Вы написли. Повторите попытку, нажав на Run! ");
            return;
        }
        int i = sc.nextInt();
        switch (i) {
            case 1: System.out.println("Красный");
            break;
            case 2: System.out.println("Оранжевый");
            break;
            case 3: System.out.println("Жёлтый");
            break;
            case 4: System.out.println("Зеленый");
            break;
            case 5: System.out.println("Голубой");
            break;
            case 6: System.out.println("Синий");
            break;
            case 7: System.out.println("Фиолетовый");
            break;
            default:System.out.println("Извините, но я не смог идентифицировать то, что Вы написали, вероятно, вы вышли за пределы диапазона значений!\nНе расстраивайтесь, повторите попытку, нажав Run!");
            return;
        }
        System.out.println("Скучновато?! Давайте я разбавлю игру смешной шуткой?");
        Scanner sv = new Scanner(System.in); // Add new class
            String st = sv.nextLine();
            switch (st) {
                case "yes", "Yes", "есть такое", "да", "Да", "Давай", "ок", "давай", "конечно давай","конечно да":
                    System.out.println("Пьяный мужик пришел ночью домой и кричит с порога в темноту:\n" +
                            "– Жена, начни ругаться, а то я кровать не найду!");
                break;
                case "Нет", "нет", "no", "No", "не надо": // Add some new words!
                    System.out.println("Не хотите - как хотите, сам посмеюсь!\nА Вам желаю хорошего дня!");
                    return;
                default:System.out.println("Извините, но у меня не получилось идентифицировать всё то, что Вы написли. Повторите попытку, нажав на Run! ");
                return;
            }
            System.out.println("Вам понравилось?");
        Scanner sz = new Scanner(System.in);
        String s=sz.nextLine();
        switch (s) {
            case "сойдёт", "отлично", "хорошо", "супер", "круто", "вау", "нормально", "ок", "молодец", "конечно", "да", "конечно давай","конечно да":
                System.out.println("Спасибо большое, я старался!");
                break;
            case "нет", "не очень", "no", "No", "Нет", "так себе", "несмешно", "конечно же нет":
                System.out.println("Извини, но других шуток я не знаю!\nРаз уж не понравилось-придумай свою шутку!)");
                break;
                default:System.out.println("Извините, но я не смог идентифицировать всё то, что Вы написали, так уж я запрограммирован! Повторите попытку нажав Run!");
                return;
        }
        }
}
