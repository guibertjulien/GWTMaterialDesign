package gwt.material.design.demo.shared;

import java.io.Serializable;

import com.google.gwt.resources.client.ImageResource;

public class ShowcaseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private ImageResource img;
	private String description;
	private String javaLink;
	private String uiBinderLink;
	
	public ShowcaseDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShowcaseDTO(String name, ImageResource img, String description, String javaLink, String uiBinderLink) {
		super();
		this.name = name;
		this.img = img;
		this.description = description;
		this.javaLink = javaLink;
		this.uiBinderLink = uiBinderLink;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageResource getImg() {
		return img;
	}

	public void setImg(ImageResource img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJavaLink() {
		return javaLink;
	}

	public void setJavaLink(String javaLink) {
		this.javaLink = javaLink;
	}

	public String getUiBinderLink() {
		return uiBinderLink;
	}

	public void setUiBinderLink(String uiBinderLink) {
		this.uiBinderLink = uiBinderLink;
	}
	
	
	
}
