package ar.edu.unahur.obj2;

public class Profugo implements IProfugo{
  public Integer inocencia; 
  public Integer habilidad;
  public Boolean esNervioso;

  public Profugo(Integer inocencia, Integer habilidad, Boolean esNervioso) {
    this.inocencia = inocencia;
    this.habilidad =  habilidad;
    this.esNervioso = esNervioso;
  }

  public void capturar(Profugo profugo){}

  @Override
  public Integer getInocencia() {
    return this.inocencia;
  }

  @Override
  public Integer getHabilidad() {
    return this.habilidad;
  }

  @Override
  public Boolean esNervioso() {
    return this.esNervioso;
  }

  @Override
  public void volverseNervioso() {
    this.esNervioso = true;
  }

  @Override
  public void dejarDeEstarNervioso() {
    this.esNervioso = false;
  }

  @Override
  public void reducirHabilidad() {
    this.habilidad -= 5;
  }

  @Override
  public void disminuirInocencia() {
    this.inocencia -= 2;
  };

}
