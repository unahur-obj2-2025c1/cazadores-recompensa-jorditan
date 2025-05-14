package ar.edu.unahur.obj2;

public class CazadorSigiloso implements ITipoCazador {

  @Override
  public Boolean puedeCazar(Profugo profugo) {
    return profugo.getHabilidad() < 50;
  }

  @Override 
  public void intimidar(Profugo profugo) {
    profugo.reducirHabilidad();
  }
  
}
