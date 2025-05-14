package ar.edu.unahur.obj2;

import java.util.List;

public abstract class Cazador {
  public Integer experiencia;
  public Integer inocencia; 
  public Integer habilidad;
  public Boolean nervioso;
  public ITipoCazador tipoCazador;
  public List<Profugo> profugosCapturados;
  public List<Profugo> profugosInitmidados;


  public Integer getInocencia()  {
    return this.inocencia;
  }

  public ITipoCazador getTipoCazador() {
    return this.tipoCazador;
  }

  public Integer getHabilidad() {
    return this.habilidad;
  }

  public Boolean getBoolean() {
    return this.nervioso;
  }

  public void cazar(Profugo profugo){
    if (this.getHabilidad() > profugo.getHabilidad() && this.getTipoCazador().puedeCazar(profugo)) {
      profugosCapturados.add(profugo);
    } else {
      tipoCazador.intimidar(profugo);
    }
  };

  public Integer habilidadMinimaDeIntimidados() {
    return profugosInitmidados.stream()
        .map(Profugo::getHabilidad)
        .min(Integer::compareTo)
        .orElse(null); // Retorna null si la lista está vacía
  }

  public void finalizarProcesoCaptura() {
    experiencia += this.habilidadMinimaDeIntimidados() + this.profugosCapturados.size();
  }
  
}
