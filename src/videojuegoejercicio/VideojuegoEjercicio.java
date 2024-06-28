package videojuegoejercicio;

import java.util.ArrayList;
import java.util.List;
import videojuegoejercicio.logica.VideoJuego;

public class VideojuegoEjercicio {

    public static void main(String[] args) {
        
        //PASO2
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego videojuego1 = new VideoJuego(1234,"Pokemon","Nintendo 64",2,"Versus");
        VideoJuego videojuego2 = new VideoJuego(4321,"Dota","PC",10,"Moba");
        VideoJuego videojuego3 = new VideoJuego(2341,"Lol","PC",10,"Moba");
        VideoJuego videojuego4 = new VideoJuego(3412,"GTA5","PlayStation",100,"Plataforma");
        VideoJuego videojuego5 = new VideoJuego(4123,"Mario Kart","Nintendo 64",5,"Plataforma");
       
        listaVideojuegos.add(videojuego1);
        listaVideojuegos.add(videojuego2);
        listaVideojuegos.add(videojuego3);
        listaVideojuegos.add(videojuego4);
        listaVideojuegos.add(videojuego5);
        //PASO 3 Recorrido
        for(VideoJuego video:listaVideojuegos){
            System.out.println("Titulo:"+video.getTitulo()+
                    " Consola: "+video.getConsola()+" Cantidad Jugadores: "+video.getCantidadJugadores());
        }
        //PASO 4 - cambio de nobmre y jugadores
        videojuego1.setTitulo("Pokemon Go");
        videojuego1.setCantidadJugadores(3);
        
        videojuego2.setTitulo("Dota 2");
        videojuego2.setCantidadJugadores(20);
        System.out.println("--------------------------");
        //Paso5
        for(VideoJuego video:listaVideojuegos){
            if(video.getConsola().equals("Nintendo 64")){
                    System.out.println(video.toString());
            }
        }
    }

}
