public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футов", "взаимный",
                "обоюдный выиграш", "фронтэнд", "на основе веб-технологие", "проникающий",
                "умный", "шусть сигм", "метод критрческого пути", "динамимичный",};
        String[] worldListTwo = {"уполномоченый", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использыванный с выгодой", "выровненный", "нацеленный на",
                "общий", "совместный", "ускоренный",};
        String[] worldListThree = {"процусс", "пункт разгрузки", "выход из положения", "тип структуры",
                "талант", "подход", "уровень завоеванный внимание", "портал", "период времени",
                "оброз", "образец", "пункт следование",};
        int oneLength = wordListOne.length;
        int twoLength = worldListTwo.length;
        int threeLength = worldListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + worldListTwo[rand2] + " " +worldListThree[rand3];
        System.out.println("Все, что нам нужно, это " + phrase);
    }
}