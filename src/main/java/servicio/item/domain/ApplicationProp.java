package servicio.item.domain;

/**
 * Clase que representa las propiedades del proyecto
 * @author raulr
 *
 */
public class ApplicationProp {
	
	private String version;
	private String description;
	private String name;
	
	public ApplicationProp(String version, String description, String name) {
		this.version = version;
		this.description = description;
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
