package Assignment.MedBlocks.demo.unified;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="records")
public class unifiedEntity {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String patientName;
	    private String ehrRecordData;
	    public unifiedEntity(){
	    	
	    }
	   public unifiedEntity(long id,String name,String data){
	    	this.id=id;
	    	this.ehrRecordData=data;
	    	this.patientName=name;
	    }
		public Long getId() {
			return id;
		}
		@Column(name="id",nullable=false)
		public void setId(Long id) {
			this.id = id;
		}
		public String getPatientName() {
			return patientName;
		}
		@Column(name="patientName",nullable=false)
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public String getEhrRecordData() {
			return ehrRecordData;
		}
		@Column(name="ehrRecordData",nullable=false)
		public void setEhrRecordData(String ehrRecordData) {
			this.ehrRecordData = ehrRecordData;
		}
	    public String toString() {
	    	return id+patientName+ehrRecordData;
	    }
}
