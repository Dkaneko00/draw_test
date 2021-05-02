public class Map1 {

    String[] tips = {
        "  ", // blank
        "**",  // player
        "[]"  // block
    };

    public Map1() {
    }
    
    public String getTips(int num) {
        return this.tips[num];
    }

   public void draw(int[][] map, int py, int px) {
        for(int i = 0; i < map.length; i++) {
            String screen_buf = ""; 
            for(int j = 0; j < map[0].length; j++) {
                if(i == px && j == py){
                    screen_buf += getTips(1);
                } else {
                    screen_buf += getTips(map[i][j]);
                }
            }
            System.out.println(screen_buf);
        }
        // 操作
        System.out.println("w: up, s: down, a: left, d: right, q: exit, Enter: select");

   } 
}
