import java.util.Date;

public class Aliments {
	
	protected MoyenDeStockage Ms;
	
	protected Date DDP;
	
	protected UniteDeMesure UDM;
	
	protected String nom;

	public Aliments(MoyenDeStockage ms, Date dDP, UniteDeMesure uDM, String nom) {
		super();
		this.Ms = ms;
		this.DDP = dDP;
		this.UDM = uDM;
		this.nom = nom;
	}

	public MoyenDeStockage getMoyenStockage() {
		return Ms;
	}

	public void setMoyenStockage(MoyenDeStockage ms) {
		Ms = ms;
	}

	public Date getDateDePeremption() {
		return DDP;
	}

	public void setDateDePeremption(Date dDP) {
		DDP = dDP;
	}

	public UniteDeMesure getUniteDeMesure() {
		return UDM;
	}

	public void setUniteDeMesure(UniteDeMesure uDM) {
		UDM = uDM;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
