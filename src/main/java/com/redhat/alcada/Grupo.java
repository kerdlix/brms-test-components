package com.redhat.alcada;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Grupo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.util.List<com.redhat.alcada.Elemento> elementos;

   private com.redhat.alcada.Alcada _alcada1;

   private com.redhat.alcada.Alcada _alcada2;

   public Grupo()
   {
   }

   public java.util.List<com.redhat.alcada.Elemento> getElementos()
   {
      return this.elementos;
   }

   public void setElementos(
         java.util.List<com.redhat.alcada.Elemento> elementos)
   {
      this.elementos = elementos;
   }

   public com.redhat.alcada.Alcada get_alcada1()
   {
      return this._alcada1;
   }

   public void set_alcada1(com.redhat.alcada.Alcada _alcada1)
   {
      this._alcada1 = _alcada1;
   }

   public com.redhat.alcada.Alcada get_alcada2()
   {
      return this._alcada2;
   }

   public void set_alcada2(com.redhat.alcada.Alcada _alcada2)
   {
      this._alcada2 = _alcada2;
   }

   public Grupo(java.util.List<com.redhat.alcada.Elemento> elementos,
         com.redhat.alcada.Alcada _alcada1, com.redhat.alcada.Alcada _alcada2)
   {
      this.elementos = elementos;
      this._alcada1 = _alcada1;
      this._alcada2 = _alcada2;
   }

}