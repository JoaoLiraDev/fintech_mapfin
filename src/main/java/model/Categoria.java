package model;
  
 
  public class Categoria {
  
    private String ID_CATEGORIA;
          
    private String NM_CATEGORIA;
        
    
    public Categoria(String ID_CATEGORIA, String NM_CATEGORIA) {
    	
      super();
      this.ID_CATEGORIA = ID_CATEGORIA;
      this.NM_CATEGORIA = NM_CATEGORIA;

    }
  
    public Categoria() {
      super();
    }

	public String getID_CATEGORIA() {
		return ID_CATEGORIA;
	}

	public void setID_CATEGORIA(String ID_CATEGORIA) {
		this.ID_CATEGORIA = ID_CATEGORIA;
	}

	public String getNM_CATEGORIA() {
		return NM_CATEGORIA;
	}

	public void setNM_CATEGORIA(String NM_CATEGORIA) {
		this.NM_CATEGORIA = NM_CATEGORIA;
	}  
    
    
  }