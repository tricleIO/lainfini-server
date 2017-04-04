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
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Spmnorm
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-29T11:52:08.096+02:00")
public class Spmnorm   {
  @SerializedName("displayname")
  private String displayname = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("classid")
  private String classid = null;

  @SerializedName("objversion")
  private Integer objversion = null;

  @SerializedName("rows")
  private List<Spmnormmaterials> rows = new ArrayList<Spmnormmaterials>();

  @SerializedName("storecard_id")
  private String storecardId = null;

  @SerializedName("storecardcode")
  private String storecardcode = null;

  @SerializedName("storecardname")
  private String storecardname = null;

  @SerializedName("qunit")
  private String qunit = null;

  @SerializedName("unitrate")
  private Double unitrate = null;

  @SerializedName("quantity")
  private Double quantity = null;

  @SerializedName("unitquantity")
  private Double unitquantity = null;

  @SerializedName("weightingrams")
  private Double weightingrams = null;

  @SerializedName("weightingrcalculated")
  private Double weightingrcalculated = null;

  @SerializedName("unitweightingrams")
  private Double unitweightingrams = null;

  @SerializedName("unitweightingrcalculated")
  private Double unitweightingrcalculated = null;

  @SerializedName("operationdescription")
  private String operationdescription = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("createdby_id")
  private String createdbyId = null;

  @SerializedName("createddate$date")
  private DateTime createddatedate = null;

  @SerializedName("correctedby_id")
  private String correctedbyId = null;

  @SerializedName("correcteddate$date")
  private DateTime correcteddatedate = null;

  @SerializedName("picture_id")
  private Spmnorm pictureId = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("calculatedunitprice")
  private Double calculatedunitprice = null;

  @SerializedName("calculatedprice")
  private Double calculatedprice = null;

  @SerializedName("pictures")
  private List<Spmnormpicture> pictures = new ArrayList<Spmnormpicture>();

  public Spmnorm displayname(String displayname) {
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

  public Spmnorm id(String id) {
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

  public Spmnorm classid(String classid) {
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

  public Spmnorm objversion(Integer objversion) {
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

  public Spmnorm rows(List<Spmnormmaterials> rows) {
    this.rows = rows;
    return this;
  }

  public Spmnorm addRowsItem(Spmnormmaterials rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce bo norma kompletace - řádek [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce bo norma kompletace - řádek [nepersistentní položka]")
  public List<Spmnormmaterials> getRows() {
    return rows;
  }

  public void setRows(List<Spmnormmaterials> rows) {
    this.rows = rows;
  }

  public Spmnorm storecardId(String storecardId) {
    this.storecardId = storecardId;
    return this;
  }

   /**
   * skladová karta; id objektu skladová karta [persistentní položka]
   * @return storecardId
  **/
  @ApiModelProperty(example = "null", value = "skladová karta; id objektu skladová karta [persistentní položka]")
  public String getStorecardId() {
    return storecardId;
  }

  public void setStorecardId(String storecardId) {
    this.storecardId = storecardId;
  }

  public Spmnorm storecardcode(String storecardcode) {
    this.storecardcode = storecardcode;
    return this;
  }

   /**
   * skladová karta - kód
   * @return storecardcode
  **/
  @ApiModelProperty(example = "null", value = "skladová karta - kód")
  public String getStorecardcode() {
    return storecardcode;
  }

  public void setStorecardcode(String storecardcode) {
    this.storecardcode = storecardcode;
  }

  public Spmnorm storecardname(String storecardname) {
    this.storecardname = storecardname;
    return this;
  }

   /**
   * skladová karta - název
   * @return storecardname
  **/
  @ApiModelProperty(example = "null", value = "skladová karta - název")
  public String getStorecardname() {
    return storecardname;
  }

  public void setStorecardname(String storecardname) {
    this.storecardname = storecardname;
  }

  public Spmnorm qunit(String qunit) {
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

  public Spmnorm unitrate(Double unitrate) {
    this.unitrate = unitrate;
    return this;
  }

   /**
   * vztah
   * @return unitrate
  **/
  @ApiModelProperty(example = "null", value = "vztah")
  public Double getUnitrate() {
    return unitrate;
  }

  public void setUnitrate(Double unitrate) {
    this.unitrate = unitrate;
  }

  public Spmnorm quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * počet v jedn.se vzt.1 [persistentní položka]
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "počet v jedn.se vzt.1 [persistentní položka]")
  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }

  public Spmnorm unitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
    return this;
  }

   /**
   * počet
   * @return unitquantity
  **/
  @ApiModelProperty(example = "null", value = "počet")
  public Double getUnitquantity() {
    return unitquantity;
  }

  public void setUnitquantity(Double unitquantity) {
    this.unitquantity = unitquantity;
  }

  public Spmnorm weightingrams(Double weightingrams) {
    this.weightingrams = weightingrams;
    return this;
  }

   /**
   * celková hmotnost v gramech
   * @return weightingrams
  **/
  @ApiModelProperty(example = "null", value = "celková hmotnost v gramech")
  public Double getWeightingrams() {
    return weightingrams;
  }

  public void setWeightingrams(Double weightingrams) {
    this.weightingrams = weightingrams;
  }

  public Spmnorm weightingrcalculated(Double weightingrcalculated) {
    this.weightingrcalculated = weightingrcalculated;
    return this;
  }

   /**
   * celk. hmot. v gr. vypočtená
   * @return weightingrcalculated
  **/
  @ApiModelProperty(example = "null", value = "celk. hmot. v gr. vypočtená")
  public Double getWeightingrcalculated() {
    return weightingrcalculated;
  }

  public void setWeightingrcalculated(Double weightingrcalculated) {
    this.weightingrcalculated = weightingrcalculated;
  }

  public Spmnorm unitweightingrams(Double unitweightingrams) {
    this.unitweightingrams = unitweightingrams;
    return this;
  }

   /**
   * hmotnost jednotky v gramech
   * @return unitweightingrams
  **/
  @ApiModelProperty(example = "null", value = "hmotnost jednotky v gramech")
  public Double getUnitweightingrams() {
    return unitweightingrams;
  }

  public void setUnitweightingrams(Double unitweightingrams) {
    this.unitweightingrams = unitweightingrams;
  }

  public Spmnorm unitweightingrcalculated(Double unitweightingrcalculated) {
    this.unitweightingrcalculated = unitweightingrcalculated;
    return this;
  }

   /**
   * hmotnost jedn. v gr. vypočtená
   * @return unitweightingrcalculated
  **/
  @ApiModelProperty(example = "null", value = "hmotnost jedn. v gr. vypočtená")
  public Double getUnitweightingrcalculated() {
    return unitweightingrcalculated;
  }

  public void setUnitweightingrcalculated(Double unitweightingrcalculated) {
    this.unitweightingrcalculated = unitweightingrcalculated;
  }

  public Spmnorm operationdescription(String operationdescription) {
    this.operationdescription = operationdescription;
    return this;
  }

   /**
   * pracovní postup [persistentní položka]
   * @return operationdescription
  **/
  @ApiModelProperty(example = "null", value = "pracovní postup [persistentní položka]")
  public String getOperationdescription() {
    return operationdescription;
  }

  public void setOperationdescription(String operationdescription) {
    this.operationdescription = operationdescription;
  }

  public Spmnorm description(String description) {
    this.description = description;
    return this;
  }

   /**
   * poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Spmnorm createdbyId(String createdbyId) {
    this.createdbyId = createdbyId;
    return this;
  }

   /**
   * vytvořil; id objektu uživatel [persistentní položka]
   * @return createdbyId
  **/
  @ApiModelProperty(example = "null", value = "vytvořil; id objektu uživatel [persistentní položka]")
  public String getCreatedbyId() {
    return createdbyId;
  }

  public void setCreatedbyId(String createdbyId) {
    this.createdbyId = createdbyId;
  }

  public Spmnorm createddatedate(DateTime createddatedate) {
    this.createddatedate = createddatedate;
    return this;
  }

   /**
   * datum vytvoření [persistentní položka]
   * @return createddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum vytvoření [persistentní položka]")
  public DateTime getCreateddatedate() {
    return createddatedate;
  }

  public void setCreateddatedate(DateTime createddatedate) {
    this.createddatedate = createddatedate;
  }

  public Spmnorm correctedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
    return this;
  }

   /**
   * opravil; id objektu uživatel [persistentní položka]
   * @return correctedbyId
  **/
  @ApiModelProperty(example = "null", value = "opravil; id objektu uživatel [persistentní položka]")
  public String getCorrectedbyId() {
    return correctedbyId;
  }

  public void setCorrectedbyId(String correctedbyId) {
    this.correctedbyId = correctedbyId;
  }

  public Spmnorm correcteddatedate(DateTime correcteddatedate) {
    this.correcteddatedate = correcteddatedate;
    return this;
  }

   /**
   * datum opravy [persistentní položka]
   * @return correcteddatedate
  **/
  @ApiModelProperty(example = "null", value = "datum opravy [persistentní položka]")
  public DateTime getCorrecteddatedate() {
    return correcteddatedate;
  }

  public void setCorrecteddatedate(DateTime correcteddatedate) {
    this.correcteddatedate = correcteddatedate;
  }

  public Spmnorm pictureId(Spmnorm pictureId) {
    this.pictureId = pictureId;
    return this;
  }

   /**
   * Get pictureId
   * @return pictureId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Spmnorm getPictureId() {
    return pictureId;
  }

  public void setPictureId(Spmnorm pictureId) {
    this.pictureId = pictureId;
  }

  public Spmnorm storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * sklad; id objektu sklad [persistentní položka]
   * @return storeId
  **/
  @ApiModelProperty(example = "null", value = "sklad; id objektu sklad [persistentní položka]")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Spmnorm calculatedunitprice(Double calculatedunitprice) {
    this.calculatedunitprice = calculatedunitprice;
    return this;
  }

   /**
   * cena jednotky
   * @return calculatedunitprice
  **/
  @ApiModelProperty(example = "null", value = "cena jednotky")
  public Double getCalculatedunitprice() {
    return calculatedunitprice;
  }

  public void setCalculatedunitprice(Double calculatedunitprice) {
    this.calculatedunitprice = calculatedunitprice;
  }

  public Spmnorm calculatedprice(Double calculatedprice) {
    this.calculatedprice = calculatedprice;
    return this;
  }

   /**
   * cena [persistentní položka]
   * @return calculatedprice
  **/
  @ApiModelProperty(example = "null", value = "cena [persistentní položka]")
  public Double getCalculatedprice() {
    return calculatedprice;
  }

  public void setCalculatedprice(Double calculatedprice) {
    this.calculatedprice = calculatedprice;
  }

  public Spmnorm pictures(List<Spmnormpicture> pictures) {
    this.pictures = pictures;
    return this;
  }

  public Spmnorm addPicturesItem(Spmnormpicture picturesItem) {
    this.pictures.add(picturesItem);
    return this;
  }

   /**
   * obrázky; kolekce bo norma kompletace - obrázek [nepersistentní položka]
   * @return pictures
  **/
  @ApiModelProperty(example = "null", value = "obrázky; kolekce bo norma kompletace - obrázek [nepersistentní položka]")
  public List<Spmnormpicture> getPictures() {
    return pictures;
  }

  public void setPictures(List<Spmnormpicture> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spmnorm spmnorm = (Spmnorm) o;
    return Objects.equals(this.displayname, spmnorm.displayname) &&
        Objects.equals(this.id, spmnorm.id) &&
        Objects.equals(this.classid, spmnorm.classid) &&
        Objects.equals(this.objversion, spmnorm.objversion) &&
        Objects.equals(this.rows, spmnorm.rows) &&
        Objects.equals(this.storecardId, spmnorm.storecardId) &&
        Objects.equals(this.storecardcode, spmnorm.storecardcode) &&
        Objects.equals(this.storecardname, spmnorm.storecardname) &&
        Objects.equals(this.qunit, spmnorm.qunit) &&
        Objects.equals(this.unitrate, spmnorm.unitrate) &&
        Objects.equals(this.quantity, spmnorm.quantity) &&
        Objects.equals(this.unitquantity, spmnorm.unitquantity) &&
        Objects.equals(this.weightingrams, spmnorm.weightingrams) &&
        Objects.equals(this.weightingrcalculated, spmnorm.weightingrcalculated) &&
        Objects.equals(this.unitweightingrams, spmnorm.unitweightingrams) &&
        Objects.equals(this.unitweightingrcalculated, spmnorm.unitweightingrcalculated) &&
        Objects.equals(this.operationdescription, spmnorm.operationdescription) &&
        Objects.equals(this.description, spmnorm.description) &&
        Objects.equals(this.createdbyId, spmnorm.createdbyId) &&
        Objects.equals(this.createddatedate, spmnorm.createddatedate) &&
        Objects.equals(this.correctedbyId, spmnorm.correctedbyId) &&
        Objects.equals(this.correcteddatedate, spmnorm.correcteddatedate) &&
        Objects.equals(this.pictureId, spmnorm.pictureId) &&
        Objects.equals(this.storeId, spmnorm.storeId) &&
        Objects.equals(this.calculatedunitprice, spmnorm.calculatedunitprice) &&
        Objects.equals(this.calculatedprice, spmnorm.calculatedprice) &&
        Objects.equals(this.pictures, spmnorm.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayname, id, classid, objversion, rows, storecardId, storecardcode, storecardname, qunit, unitrate, quantity, unitquantity, weightingrams, weightingrcalculated, unitweightingrams, unitweightingrcalculated, operationdescription, description, createdbyId, createddatedate, correctedbyId, correcteddatedate, pictureId, storeId, calculatedunitprice, calculatedprice, pictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Spmnorm {\n");
    
    sb.append("    displayname: ").append(toIndentedString(displayname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    classid: ").append(toIndentedString(classid)).append("\n");
    sb.append("    objversion: ").append(toIndentedString(objversion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    storecardId: ").append(toIndentedString(storecardId)).append("\n");
    sb.append("    storecardcode: ").append(toIndentedString(storecardcode)).append("\n");
    sb.append("    storecardname: ").append(toIndentedString(storecardname)).append("\n");
    sb.append("    qunit: ").append(toIndentedString(qunit)).append("\n");
    sb.append("    unitrate: ").append(toIndentedString(unitrate)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitquantity: ").append(toIndentedString(unitquantity)).append("\n");
    sb.append("    weightingrams: ").append(toIndentedString(weightingrams)).append("\n");
    sb.append("    weightingrcalculated: ").append(toIndentedString(weightingrcalculated)).append("\n");
    sb.append("    unitweightingrams: ").append(toIndentedString(unitweightingrams)).append("\n");
    sb.append("    unitweightingrcalculated: ").append(toIndentedString(unitweightingrcalculated)).append("\n");
    sb.append("    operationdescription: ").append(toIndentedString(operationdescription)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdbyId: ").append(toIndentedString(createdbyId)).append("\n");
    sb.append("    createddatedate: ").append(toIndentedString(createddatedate)).append("\n");
    sb.append("    correctedbyId: ").append(toIndentedString(correctedbyId)).append("\n");
    sb.append("    correcteddatedate: ").append(toIndentedString(correcteddatedate)).append("\n");
    sb.append("    pictureId: ").append(toIndentedString(pictureId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    calculatedunitprice: ").append(toIndentedString(calculatedunitprice)).append("\n");
    sb.append("    calculatedprice: ").append(toIndentedString(calculatedprice)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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
