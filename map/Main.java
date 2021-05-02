import java.util.Scanner;
class Main {
    public static void main(String[] args){


        int[][] map = {
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2},
            {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}
                         };


        // 初期位置
        int startx = 1;
        int starty = map.length - 2;

        // プレーヤー座標
        int px = startx;
        int py = starty;
        Map1 stage1 = new Map1();

        Console.clear();
        stage1.draw(map, px, py);
        // プレーヤー移動
        Scanner scan = new Scanner(System.in);
        while(true) {
            String input = scan.nextLine();
            if(input.equals("a")){
                Console.clear();
                //移動先にブロックが無いか判定
                if(map[py][px - 1] != 2){
                px--;
                }
            } else if(input.equals("w")){
                Console.clear();
                if(map[py - 1][px] != 2){
                py--;
                }
            } else if(input.equals("d")){
                Console.clear();
                if(map[py][px + 1] != 2){
                px++;
                }
            } else if(input.equals("s")){
                Console.clear();
                if(map[py + 1][px] != 2){
                py++;
                }
            } else if(input.equals("q")){
                Console.clear();
                System.out.println("Exit");
                break;
            } else {
                continue;
            }

            stage1.draw(map, px, py);
            
        } 
        scan.close();
        
    }
}
