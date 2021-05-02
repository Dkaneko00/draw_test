public class Message{

    public static void slow(String m, String um, String dm){

        for(int i = 0; i< m.length(); i++){
            Console.clear();
            System.out.println(um);

            //改行の個数取得
            var count = m.chars().filter(ch -> ch == '\n').count();
            System.out.println(m.substring(0,i + 1));
            for(int j = 0; j <count - m.substring(0,i + 1).chars().filter(ch -> ch == '\n').count(); j++){
                System.out.println();
            }
            System.out.println(dm);
            try{
                Thread.sleep(100);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
