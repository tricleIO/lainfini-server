/**
 * abra gen web api (spojení testapi)
 * webové api systému 17.03.03
 *
 * OpenAPI spec version: 17.03.03
 * Contact: abragen@abra.eu
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package application.service.abra.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Plmjoinputitem
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Plmjoinputitem   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("plmmiplmaterialdistribution")
  private List<Plmmiplmaterialdistribution> plmmiplmaterialdistribution = new ArrayList<Plmmiplmaterialdistribution>();

  @SerializedName("plmmiplrmaterialdistribution")
  private List<Plmmiplrmaterialdistribution> plmmiplrmaterialdistribution = new ArrayList<Plmmiplrmaterialdistribution>();

  @SerializedName("plmjoinputitemreservations")
  private List<Plmjoinputitemreservation> plmjoinputitemreservations = new ArrayList<Plmjoinputitemreservation>();

  @SerializedName("replaceable")
  private Boolean replaceable = null;

  @SerializedName("realstorecard_id")
  private String realstorecardId = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("allowmix")
  private Boolean allowmix = null;

  @SerializedName("reservedquantity")
  private Double reservedquantity = null;

  @SerializedName("reservedunitquantity")
  private Double reservedunitquantity = null;

  @SerializedName("distributedquantity")
  private Double distributedquantity = null;

  @SerializedName("distributedunitquantity")
  private Double distributedunitquantity = null;

  @SerializedName("phase_id")
  private String phaseId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("recordssn")
  private Boolean recordssn = null;

  @SerializedName("supposedstore_id")
  private String supposedstoreId = null;

  @SerializedName("wastepercentage")
  private Double wastepercentage = null;

  @SerializedName("quantityrounding")
  private Integer quantityrounding = null;

  @SerializedName("demandstatus")
  private Integer demandstatus = null;

  @SerializedName("storequantitywithreplacements")
  private Double storequantitywithreplacements = null;

  @SerializedName("confirmationdifferences")
  private List<Plmjoinputitemconfdiff> confirmationdifferences = new ArrayList<Plmjoinputitemconfdiff>();

  @SerializedName("owner_id")
  private String ownerId = null;

  public Plmjoinputitem displayname(String displayname) {
    this.displayname = displayname;
    return this;
  }

   /**
   * název
   * @return displayname
  **/
  @ApiModelProperty(example = "null", value = "název")
  public String getDisplayname() {
    return displayname;
  }

  public void setDisplayname(String displayname) {
    this.displayname = displayname;
  }

  public Plmjoinputitem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * vlastní id [persistentní položka]
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "vlastní id [persistentní položka]")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plmjoinputitem classid(String classid) {
    this.classid = classid;
    return this;
  }

   /**
   * id třídy
   * @return classid
  **/
  @ApiModelProperty(example = "null", value = "id třídy")
  public String getClassid() {
    return classid;
  }

  public void setClassid(String classid) {
    this.classid = classid;
  }

  public Plmjoinputitem objversion(Integer objversion) {
    this.objversion = objversion;
    return this;
  }

   /**
   * verze objektu [persistentní položka]
   * @return objversion
  **/
  @ApiModelProperty(example = "null", value = "verze objektu [persistentní položka]")
  public Integer getObjversion() {
    return objversion;
  }

  public void setObjversion(Integer objversion) {
    this.objversion = objversion;
  }

  public Plmjoinputitem plmmiplmaterialdistribution(List<Plmmiplmaterialdistribution> plmmiplmaterialdistribution) {
    this.plmmiplmaterialdistribution = plmmiplmaterialdistribution;
    return this;
  }

  public Plmjoinputitem addPlmmiplmaterialdistributionItem(Plmmiplmaterialdistribution plmmiplmaterialdistributionItem) {
    this.plmmiplmaterialdistribution.add(plmmiplmaterialdistributionItem);
    return this;
  }

   /**
   * výdejky; kolekce bo vp - výdej materiálu [nepersistentní položka]
   * @return plmmiplmaterialdistribution
  **/
  @ApiModelProperty(example = "null", value = "výdejky; kolekce bo vp - výdej materiálu [nepersistentní položka]")
  public List<Plmmiplmaterialdistribution> getPlmmiplmaterialdistribution() {
    return plmmiplmaterialdistribution;
  }

  public void setPlmmiplmaterialdistribution(List<Plmmiplmaterialdistribution> plmmiplmaterialdistribution) {
    this.plmmiplmaterialdistribution = plmmiplmaterialdistribution;
  }

  public Plmjoinputitem plmmiplrmaterialdistribution(List<Plmmiplrmaterialdistribution> plmmiplrmaterialdistribution) {
    this.plmmiplrmaterialdistribution = plmmiplrmaterialdistribution;
    return this;
  }

  public Plmjoinputitem addPlmmiplrmaterialdistributionItem(Plmmiplrmaterialdistribution plmmiplrmaterialdistributionItem) {
    this.plmmiplrmaterialdistribution.add(plmmiplrmaterialdistributionItem);
    return this;
  }

   /**
   * vratky; kolekce bo vp - vrácení materiálu [nepersistentní položka]
   * @return plmmiplrmaterialdistribution
  **/
  @ApiModelProperty(example = "null", value = "vratky; kolekce bo vp - vrácení materiálu [nepersistentní položka]")
  public List<Plmmiplrmaterialdistribution> getPlmmiplrmaterialdistribution() {
    return plmmiplrmaterialdistribution;
  }

  public void setPlmmiplrmaterialdistribution(List<Plmmiplrmaterialdistribution> plmmiplrmaterialdistribution) {
    this.plmmiplrmaterialdistribution = plmmiplrmaterialdistribution;
  }

  public Plmjoinputitem plmjoinputitemreservations(List<Plmjoinputitemreservation> plmjoinputitemreservations) {
    this.plmjoinputitemreservations = plmjoinputitemreservations;
    return this;
  }

  public Plmjoinputitem addPlmjoinputitemreservationsItem(Plmjoinputitemreservation plmjoinputitemreservationsItem) {
    this.plmjoinputitemreservations.add(plmjoinputitemreservationsItem);
    return this;
  }

   /**
   * rezervace; kolekce bo vp - rezervace [nepersistentní položka]
   * @return plmjoinputitemreservations
  **/
  @ApiModelProperty(example = "null", value = "rezervace; kolekce bo vp - rezervace [nepersistentní položka]")
  public List<Plmjoinputitemreservation> getPlmjoinputitemreservations() {
    return plmjoinputitemreservations;
  }

  public void setPlmjoinputitemreservations(List<Plmjoinputitemreservation> plmjoinputitemreservations) {
    this.plmjoinputitemreservations = plmjoinputitemreservations;
  }

  public Plmjoinputitem replaceable(Boolean replaceable) {
    this.replaceable = replaceable;
    return this;
  }

   /**
   * aut. náhrada [persistentní položka]
   * @return replaceable
  **/
  @ApiModelProperty(example = "null", value = "aut. náhrada [persistentní položka]")
  public Boolean getReplaceable() {
    return replaceable;
  }

  public void setReplaceable(Boolean replaceable) {
    this.replaceable = replaceable;
  }

  public Plmjoinputitem realstorecardId(String realstorecardId) {
    this.realstorecardId = realstorecardId;
    return this;
  }

   /**
   * skutečně použitý materiál; id objektu skladová karta [persistentní položka]
   * @return realstorecardId
  **/
  @ApiModelProperty(example = "null", value = "skutečně použitý materiál; id objektu skladová karta [persistentní položka]")
  public String getRealstorecardId() {
    return realstorecardId;
  }

  public void setRealstorecardId(String realstorecardId) {
    this.realstorecardId = realstorecardId;
  }

  public Plmjoinputitem quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * množství v ev. jednotkách [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "množství v ev. jednotkách [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Plmjoinputitem qunit(String qunit) {
    this.qunit = qunit;
    return this;
  }

   /**
   * jednotka [persistentní položka]
   * @return qunit
  **/
  @ApiModelProperty(example = "null", value = "jednotka [persistentní položka]")
  public String getQunit() {
    return qunit;
  }

  public void setQunit(String qunit) {
    this.qunit = qunit;
  }

  public Plmjoinputitem unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah [persistentní položka]
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah [persistentní položka]")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Plmjoinputitem unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * množství
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "množství")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Plmjoinputitem allowmix(Boolean allowmix) {
    this.allowmix = allowmix;
    return this;
  }

   /**
   * mix [persistentní položka]
   * @return allowmix
  **/
  @ApiModelProperty(example = "null", value = "mix [persistentní položka]")
  public Boolean getAllowmix() {
    return allowmix;
  }

  public void setAllowmix(Boolean allowmix) {
    this.allowmix = allowmix;
  }

  public Plmjoinputitem reservedquantity(Double reservedquantity) {
    this.reservedquantity = reservedquantity;
    return this;
  }

   /**
   * rezervováno
   * @return reservedquantity
  **/
  @ApiModelProperty(example = "null", value = "rezervováno")
  public Double getReservedquantity() {
    return reservedquantity;
  }

  public void setReservedquantity(Double reservedquantity) {
    this.reservedquantity = reservedquantity;
  }

  public Plmjoinputitem reservedunitquantity(Double reservedunitquantity) {
    this.reservedunitquantity = reservedunitquantity;
    return this;
  }

   /**
   * rezervováno v ev.jedn.
   * @return reservedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "rezervováno v ev.jedn.")
  public Double getReservedunitquantity() {
    return reservedunitquantity;
  }

  public void setReservedunitquantity(Double reservedunitquantity) {
    this.reservedunitquantity = reservedunitquantity;
  }

  public Plmjoinputitem distributedquantity(Double distributedquantity) {
    this.distributedquantity = distributedquantity;
    return this;
  }

   /**
   * vydáno v ev.jedn.
   * @return distributedquantity
  **/
  @ApiModelProperty(example = "null", value = "vydáno v ev.jedn.")
  public Double getDistributedquantity() {
    return distributedquantity;
  }

  public void setDistributedquantity(Double distributedquantity) {
    this.distributedquantity = distributedquantity;
  }

  public Plmjoinputitem distributedunitquantity(Double distributedunitquantity) {
    this.distributedunitquantity = distributedunitquantity;
    return this;
  }

   /**
   * vydáno
   * @return distributedunitquantity
  **/
  @ApiModelProperty(example = "null", value = "vydáno")
  public Double getDistributedunitquantity() {
    return distributedunitquantity;
  }

  public void setDistributedunitquantity(Double distributedunitquantity) {
    this.distributedunitquantity = distributedunitquantity;
  }

  public Plmjoinputitem phaseId(String phaseId) {
    this.phaseId = phaseId;
    return this;
  }

   /**
   * etapa; id objektu etapa [persistentní položka]
   * @return phaseId
  **/
  @ApiModelProperty(example = "null", value = "etapa; id objektu etapa [persistentní položka]")
  public String getPhaseId() {
    return phaseId;
  }

  public void setPhaseId(String phaseId) {
    this.phaseId = phaseId;
  }

  public Plmjoinputitem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * označení [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "označení [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Plmjoinputitem note(String note) {
    this.note = note;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Plmjoinputitem recordssn(Boolean recordssn) {
    this.recordssn = recordssn;
    return this;
  }

   /**
   * evidovat sČ [persistentní položka]
   * @return recordssn
  **/
  @ApiModelProperty(example = "null", value = "evidovat sČ [persistentní položka]")
  public Boolean getRecordssn() {
    return recordssn;
  }

  public void setRecordssn(Boolean recordssn) {
    this.recordssn = recordssn;
  }

  public Plmjoinputitem supposedstoreId(String supposedstoreId) {
    this.supposedstoreId = supposedstoreId;
    return this;
  }

   /**
   * předpokládaný sklad; id objektu sklad [persistentní položka]
   * @return supposedstoreId
  **/
  @ApiModelProperty(example = "null", value = "předpokládaný sklad; id objektu sklad [persistentní položka]")
  public String getSupposedstoreId() {
    return supposedstoreId;
  }

  public void setSupposedstoreId(String supposedstoreId) {
    this.supposedstoreId = supposedstoreId;
  }

  public Plmjoinputitem wastepercentage(Double wastepercentage) {
    this.wastepercentage = wastepercentage;
    return this;
  }

   /**
   * ztráty [%] [persistentní položka]
   * @return wastepercentage
  **/
  @ApiModelProperty(example = "null", value = "ztráty [%] [persistentní položka]")
  public Double getWastepercentage() {
    return wastepercentage;
  }

  public void setWastepercentage(Double wastepercentage) {
    this.wastepercentage = wastepercentage;
  }

  public Plmjoinputitem quantityrounding(Integer quantityrounding) {
    this.quantityrounding = quantityrounding;
    return this;
  }

   /**
   * zaokrouhlení množství [persistentní položka]
   * @return quantityrounding
  **/
  @ApiModelProperty(example = "null", value = "zaokrouhlení množství [persistentní položka]")
  public Integer getQuantityrounding() {
    return quantityrounding;
  }

  public void setQuantityrounding(Integer quantityrounding) {
    this.quantityrounding = quantityrounding;
  }

  public Plmjoinputitem demandstatus(Integer demandstatus) {
    this.demandstatus = demandstatus;
    return this;
  }

   /**
   * stav poptávky [persistentní položka]
   * @return demandstatus
  **/
  @ApiModelProperty(example = "null", value = "stav poptávky [persistentní položka]")
  public Integer getDemandstatus() {
    return demandstatus;
  }

  public void setDemandstatus(Integer demandstatus) {
    this.demandstatus = demandstatus;
  }

  public Plmjoinputitem storequantitywithreplacements(Double storequantitywithreplacements) {
    this.storequantitywithreplacements = storequantitywithreplacements;
    return this;
  }

   /**
   * stav skladu
   * @return storequantitywithreplacements
  **/
  @ApiModelProperty(example = "null", value = "stav skladu")
  public Double getStorequantitywithreplacements() {
    return storequantitywithreplacements;
  }

  public void setStorequantitywithreplacements(Double storequantitywithreplacements) {
    this.storequantitywithreplacements = storequantitywithreplacements;
  }

  public Plmjoinputitem confirmationdifferences(List<Plmjoinputitemconfdiff> confirmationdifferences) {
    this.confirmationdifferences = confirmationdifferences;
    return this;
  }

  public Plmjoinputitem addConfirmationdifferencesItem(Plmjoinputitemconfdiff confirmationdifferencesItem) {
    this.confirmationdifferences.add(confirmationdifferencesItem);
    return this;
  }

   /**
   * potvrzení rozdílů; kolekce bo vp - potvrzení rozdílu materiálu při ocenění [nepersistentní položka]
   * @return confirmationdifferences
  **/
  @ApiModelProperty(example = "null", value = "potvrzení rozdílů; kolekce bo vp - potvrzení rozdílu materiálu při ocenění [nepersistentní položka]")
  public List<Plmjoinputitemconfdiff> getConfirmationdifferences() {
    return confirmationdifferences;
  }

  public void setConfirmationdifferences(List<Plmjoinputitemconfdiff> confirmationdifferences) {
    this.confirmationdifferences = confirmationdifferences;
  }

  public Plmjoinputitem ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * vlastník; id objektu uzel stromu výrobního příkazu [persistentní položka]
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "vlastník; id objektu uzel stromu výrobního příkazu [persistentní položka]")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plmjoinputitem plmjoinputitem = (Plmjoinputitem) o;
    return Objects.equals(this.displayname, plmjoinputitem.displayname) &&
        Objects.equals(this.id, plmjoinputitem.id) &&
        Objects.equals(this.classid, plmjoinputitem.classid) &&
        Objects.equals(this.objversion, plmjoinputitem.objversion) &&
        Objects.equals(this.plmmiplmaterialdistribution, plmjoinputitem.plmmiplmaterialdistribution) &&
        Objects.equals(this.plmmiplrmaterialdistribution, plmjoinputitem.plmmiplrmaterialdistribution) &&
        Objects.equals(this.plmjoinputitemreservations, plmjoinputitem.plmjoinputitemreservations) &&
        Objects.equals(this.replaceable, plmjoinputitem.replaceable) &&
        Objects.equals(this.realstorecardId, plmjoinputitem.realstorecardId) &&
        Objects.equals(this.quantity, plmjoinputitem.quantity) &&
        Objects.equals(this.qunit, plmjoinputitem.qunit) &&
        Objects.equals(this.unitrate, plmjoinputitem.unitrate) &&
        Objects.equals(this.unitquantity, plmjoinputitem.unitquantity) &&
        Objects.equals(this.allowmix, plmjoinputitem.allowmix) &&
        Objects.equals(this.reservedquantity, plmjoinputitem.reservedquantity) &&
        Objects.equals(this.reservedunitquantity, plmjoinputitem.reservedunitquantity) &&
        Objects.equals(this.distributedquantity, plmjoinputitem.distributedquantity) &&
        Objects.equals(this.distributedunitquantity, plmjoinputitem.distributedunitquantity) &&
        Objects.equals(this.phaseId, plmjoinputitem.phaseId) &&
        Objects.equals(this.description, plmjoinputitem.description) &&
        Objects.equals(this.note, plmjoinputitem.note) &&
        Objects.equals(this.recordssn, plmjoinputitem.recordssn) &&
        Objects.equals(this.supposedstoreId, plmjoinputitem.supposedstoreId) &&
        Objects.equals(this.wastepercentage, plmjoinputitem.wastepercentage) &&
        Objects.equals(this.quantityrounding, plmjoinputitem.quantityrounding) &&
        Objects.equals(this.demandstatus, plmjoinputitem.demandstatus) &&
        Objects.equals(this.storequantitywithreplacements, plmjoinputitem.storequantitywithreplacements) &&
        Objects.equals(this.confirmationdifferences, plmjoinputitem.confirmationdifferences) &&
        Objects.equals(this.ownerId, plmjoinputitem.ownerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, plmmiplmaterialdistribution, plmmiplrmaterialdistribution, plmjoinputitemreservations, replaceable, realstorecardId, quantity, qunit, unitrate, unitquantity, allowmix, reservedquantity, reservedunitquantity, distributedquantity, distributedunitquantity, phaseId, description, note, recordssn, supposedstoreId, wastepercentage, quantityrounding, demandstatus, storequantitywithreplacements, confirmationdifferences, ownerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plmjoinputitem {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    plmmiplmaterialdistribution: ").append(toIndentedString(plmmiplmaterialdistribution)).append("\n");
    sb.append("    plmmiplrmaterialdistribution: ").append(toIndentedString(plmmiplrmaterialdistribution)).append("\n");
    sb.append("    plmjoinputitemreservations: ").append(toIndentedString(plmjoinputitemreservations)).append("\n");
    sb.append("    replaceable: ").append(toIndentedString(replaceable)).append("\n");
    sb.append("    realstorecardId: ").append(toIndentedString(realstorecardId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    allowmix: ").append(toIndentedString(allowmix)).append("\n");
    sb.append("    reservedquantity: ").append(toIndentedString(reservedquantity)).append("\n");
    sb.append("    reservedunitquantity: ").append(toIndentedString(reservedunitquantity)).append("\n");
    sb.append("    distributedquantity: ").append(toIndentedString(distributedquantity)).append("\n");
    sb.append("    distributedunitquantity: ").append(toIndentedString(distributedunitquantity)).append("\n");
    sb.append("    phaseId: ").append(toIndentedString(phaseId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    recordssn: ").append(toIndentedString(recordssn)).append("\n");
    sb.append("    supposedstoreId: ").append(toIndentedString(supposedstoreId)).append("\n");
    sb.append("    wastepercentage: ").append(toIndentedString(wastepercentage)).append("\n");
    sb.append("    quantityrounding: ").append(toIndentedString(quantityrounding)).append("\n");
    sb.append("    demandstatus: ").append(toIndentedString(demandstatus)).append("\n");
    sb.append("    storequantitywithreplacements: ").append(toIndentedString(storequantitywithreplacements)).append("\n");
    sb.append("    confirmationdifferences: ").append(toIndentedString(confirmationdifferences)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

