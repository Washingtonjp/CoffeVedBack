package br.com.rd.ved.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="pix")
public class Pix {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_pix")
	private Integer id;
	
	@Column(name="codigo_pix")
	private String codigoPix;
	
	@Column(name="img")
	private String img;
	
		
	public Pix() {
		super();
	}

	public Pix(Integer id, String codigoPix) {
		this.id = id;
		this.codigoPix = codigoPix;
	}

	public Pix(String codigoPix, String img) {
		this.codigoPix = codigoPix;
		this.img = img;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigoPix() {
		return codigoPix;
	}

	public void setCodigoPix(String codigoPix) {
		this.codigoPix = codigoPix;
	}
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}