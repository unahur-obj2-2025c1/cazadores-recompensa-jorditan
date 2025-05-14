package ar.edu.unahur.obj2;

public class CazadorRural implements ITipoCazador {

  @Override
  public Boolean puedeCazar(Profugo profugo) {
    return profugo.esNervioso();
  }


  @Override 
  public void intimidar(Profugo profugo) {
    profugo.dejarDeEstarNervioso();
  }
}
