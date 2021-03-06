package com.eiscube.hungergames.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MatPile3Model extends ModelBaseExtended
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
  
  public MatPile3Model()
  {
    textureWidth = 16;
    textureHeight = 16;
    
      Shape1 = new ModelRenderer(this, -16, 0);
      Shape1.addBox(0F, 0F, 0F, 16, 0, 16);
      Shape1.setRotationPoint(-9F, 23F, -9F);
      Shape1.setTextureSize(16, 16);
      Shape1.mirror = true;
      setRotation(Shape1, 0.0261799F, -0.0698132F, 0.0261799F);
      Shape2 = new ModelRenderer(this, -16, 0);
      Shape2.addBox(0F, 0F, 0F, 16, 0, 16);
      Shape2.setRotationPoint(9F, 23F, -3F);
      Shape2.setTextureSize(16, 16);
      Shape2.mirror = true;
      setRotation(Shape2, 0.0349066F, -2.268928F, -0.0349066F);
      Shape3 = new ModelRenderer(this, -16, 0);
      Shape3.addBox(0F, 0F, 0F, 16, 0, 16);
      Shape3.setRotationPoint(0F, 22F, 12F);
      Shape3.setTextureSize(16, 16);
      Shape3.mirror = true;
      setRotation(Shape3, 0.0349066F, 2.268928F, -0.0349066F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
  }
  
  public void renderModel(float f)
  {
	    Shape1.render(f);
	    Shape2.render(f);
	    Shape3.render(f);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5,entity);
  }

}
