import java.util.*;
import java.util.stream.Collectors;

public class Practise {

    public static void main(String[] args){

        Map<Integer,List<Integer>> map = new HashMap<>();
        map.put(1,List.of(8,23));
        map.put(2,List.of(1,5,6,54));
        map.put(3,List.of(1,2,4,45));

        int[] arr = new int[5];

        arr[4]--;

        System.out.println(arr[4]);


        System.out.println("Before Filter");
        map.forEach((k,v) -> System.out.println(k+" = "+v));



        System.out.println();
        System.out.println("After Filter");
        map =  map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,entry -> entry.getValue().stream().filter(i -> i<5).collect(Collectors.toList())));
        map.forEach((k,v) -> System.out.println(k+" = "+v));
  //      Set<Map.Entry<Integer, List<Integer>>> value =  map.entrySet();

//        System.out.println("Before filter");
//        value.forEach(System.out::print);
//        value.forEach( entry -> {
//            var entity = entry.getValue().stream().filter(i -> i > 5).collect(Collectors.toList());
//            entry.setValue(entity);
//        });
//
//        System.out.println("After Filter");
//        value.forEach(System.out::print);
//
//        System.out.println("Completed");


//        int[] arr = new int[0];
//        System.out.println(arr.length);
//        arr[0]=1;
//        System.out.println(Arrays.toString(arr));

        //System.out.println(0%10);
//
//        Boolean s= true;
//
//        Boolean result = Objects.requireNonNullElse(s,true);
//        System.out.println("Result: "+result);

 //        Set.of(1,2,3,4,5,6).stream().filter(r -> r==2).forEach(s -> System.out.println(s));

         //System.out.println(Set.of().stream().allMatch(r -> r.toString() == "A"));

//        System.out.println(new String("Kushal").substring(0,1));
//
//        Set<List<Integer>> result = new HashSet<>();
//
//        result.add(List.of(1,2,3));
//        result.add(List.of(2,3,1));
//
//        result.add(List.of(3,2,1));
//        result.add(List.of(3,4,1));
//
//        result.forEach(System.out::println);

        String []  input = {"apple","apple","aeroplane","fruit","banana"};
        var count = Arrays.stream(input).collect(Collectors.groupingBy(ele -> ele.charAt(0),Collectors.counting()))

                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue));

        System.out.println("Max Count ="+count.get().getValue());

    }
}
