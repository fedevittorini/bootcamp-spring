package com.eduit.bootcamp.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.Validate;

public class Clientes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String T_DOCUMENTO_FIELD = "TipoDocumento";
	public static String DOCUMENTO_FIELD = "Documento";
	public static String RAZON_SOCIAL_FIELD = "RazonSocial";
	public static String CORREO_FIELD = "Correo";
	public static String FECHA_NAC_FIELD = "FechaNacimiento";
	public static String TELEFONO_FIELD = "Telefono";
	
	private String tipoDocumento;
    private String documento;
    private String razonSocial;
    private String correo;
    private Date fechaNacimiento;
    private String telefono;
    
	private Clientes(String tipoDocumento, String documento, String razonSocial, String correo, Date fechaNacimiento,
			String telefono) {
		this.tipoDocumento = tipoDocumento;
		this.documento = documento;
		this.razonSocial = razonSocial;
		this.correo = correo;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCorreo() {
		return correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String toString() {
		return "{TipoDocumento: [" + this.tipoDocumento + "] Documento: [" + this.documento + "] Correo: [" + this.correo + "]}";
	}
	
  /**
   * Retrieve an instance of the class builder.
   *
   * @return the class builder. Never null.
   */
  public static Builder builder() {
    return new Builder();
  }

  /**
   * Builder.
   */
  public static class Builder {
		
		private String tipoDocumento;
	    private String documento;
	    private String razonSocial;
	    private String correo;
	    private Date fechaNacimiento;
	    private String telefono;
	    
	    
	    public Builder tipoDocumento(final String theTipoDocumento) {
	    	tipoDocumento = theTipoDocumento;
	    	return this;
	    }
	    
	    public Builder documento(final String theDocumento) {
	    	documento = theDocumento;
	    	return this;
	    }
	    
	    public Builder razonSocial(final String theRazonSocial) {
	    	razonSocial = theRazonSocial;
	    	return this;
	    }
	    
	    public Builder correo(final String theCorreo) {
	    	correo = theCorreo;
	    	return this;
	    }
	    
	    public Builder fechaNacimiento(final Date theFechaNacimiento) {
	    	fechaNacimiento = theFechaNacimiento;
	    	return this;
	    }
	    
	    public Builder telefono(final String theTelefono) {
	    	telefono = theTelefono;
	    	return this;
	    }
	    
	    public Clientes build() {
	    	return new Clientes(this.tipoDocumento,
	    			this.documento,
	    			this.razonSocial,
	    			this.correo,
	    			this.fechaNacimiento,
	    			this.telefono);
	    }
  }
}
