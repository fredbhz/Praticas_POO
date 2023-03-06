package game;

public class TestaGame {
    public static void main(String [] arg){
        Game jogo1 = new Game("Free Fire","RPG","multiplayer","12+","Ação");
        jogo1.visualizar();

        GamePC jogo2 = new GamePC("Genshin Impact", "RPG", "singleplayer e multiplayer","12+",
                "Aventura","Windows", 64);
        jogo2.visualizar();

        GamePC jogo3 = new GamePC("Jogo3", "RPG", "singleplayer", "10+","Ação",
                "Windows",32);
        jogo3.visualizar();

        GameConsole jogo4 = new GameConsole("jogo3","Plataforma","singleplayer","10+",
                "Fantasia","Xbox");
        jogo4.visualizar();

        GameConsole jogo5 = new GameConsole("jogo4","RPG", "multiplayer","16+","Ação",
                "PS5");
        jogo5.visualizar();
    }


}
