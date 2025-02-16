package Lists.Lecture.Demo;

import java.util.ArrayList;//class;
import java.util.Arrays;
import java.util.List;//class;


public class Demonstration {
    public static void main(String[] args) {
        //List -> структура от данни, в която съхраняваме съвкупност от еднотипни данни;

        //създаване на празен лист/списък
        //от цели числа
        /*List<Integer> integerList=new ArrayList<>(3);

        //от дробни числа
        List<Double> decimalList=new ArrayList<>();

        //от текстове
        List<String> textList=new ArrayList<>();

        //от символи
        List<Character> charList=new ArrayList<>();

        //размер на листа = колко е броя на елементите в листа
        System.out.println(integerList.size());

        //добавяне/вмъкване на елементи в края на списъка
        integerList.add(45);//добавя елемента в края на листа;
        integerList.add(12);
        integerList.add(72);
        integerList.add(44);

        decimalList.add(0,5.60);
        decimalList.add(1,3.44);


        System.out.println(integerList.size());
        //integerList={45, 12, 72, 44};

        //добавяне на елементи на конкретна позиция
        integerList.add(1,34);
        //integerList={45, 34, 12, 72, 44};


        //създаваме списък с предварително дефинирани елементи;
        List<Integer> numbers=new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

       //премахваме елемент от списък с цели числа;
        //Integer.valueOf -> нужно е тъй като и индекса е целочислена променлива;
        numbers.remove(Integer.valueOf(40));//премахва елемента със стойност 40;
        numbers.remove(2);//премахва стойността с индекс 2;


        //премахване на елемент с дробни, текстове и символи;
        decimalList.remove(5.60);
        decimalList.remove(1);

        //замяна на елемент в списъка
        List<String> names=new ArrayList<>(Arrays.asList("Desi", "Petya", "Rosen"));
        names.set(0,"Ivan");


        //достъпване на елемент от конкретна позиция
       String name = names.get(1);
       System.out.println(names.get(2));

       //проверка дали даден елемент присъства в спицъка
        //true->ако елемента го има в спицъка
        //false->ако елемента го няма в списъка
        System.out.println(names.contains("Peter"));

        boolean isContaining=names.contains("Ivan");
        System.out.println(isContaining);*/


        List<Double> grades=new ArrayList<>(Arrays.asList(2.66, 5.67, 3.55, 6.00, 3.44));
        //обхождане на лист
        // 1. for-> когато имаме нужда да знаем на коя позиция се намира даден елемент;
        for(int i=0;i<grades.size();i++){
           // double grade=grades.get(i);
            //System.out.println(grade);
            System.out.println(grades.get(i));

        }

        //2.foreach->имаме нужда само от елементите в листа без техните позиции
        for(double grade: grades){
            System.out.println(grade);
        }


        //премахване на всички елементи в списъка;
        System.out.println(grades.size());//5;
        grades.clear();
        //grades={};
        System.out.println(grades.size());//0;

        //проверка за празен списък;
        //isEmpty -> true/false;
        grades.isEmpty();

        //намиране на позицията на елемента
        List<Integer> codes=new ArrayList<>(Arrays.asList(34,29,34));
        System.out.println(codes.indexOf(34));//0
        System.out.println(codes.indexOf(123));//-1 ->there is no such data in the list;




    }
}
