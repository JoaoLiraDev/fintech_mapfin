package model;

import java.util.UUID;

public class Categoria {
  
    private UUID ID_CATEGORIA;
          
    private String NM_CATEGORIA;
        
    
    public Categoria(UUID ID_CATEGORIA, String NM_CATEGORIA) {
    	
      super();
      this.ID_CATEGORIA = ID_CATEGORIA;
      this.NM_CATEGORIA = NM_CATEGORIA;

    }
  
    public Categoria() {
      super();
    }

	public String getID_CATEGORIA() {
		return ID_CATEGORIA.toString();
	}

	public void setID_CATEGORIA(UUID ID_CATEGORIA) {
		this.ID_CATEGORIA = ID_CATEGORIA;
	}

	public String getNM_CATEGORIA() {
		return NM_CATEGORIA;
	}

	public void setNM_CATEGORIA(String NM_CATEGORIA) {
		this.NM_CATEGORIA = NM_CATEGORIA;
	}  
    
    
  }