/**
 * ABRA Gen Web API (spojení testapi)
 * Webové API systému 17.03.03
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
 * Mlbjourney
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-26T20:30:15.152+02:00")
public class Mlbjourney   {
  @SerializedName("DisplayName")
  private String displayName = null;

  @SerializedName("ID")
  private String ID = null;

  @SerializedName("ClassID")
  private String classID = null;

  @SerializedName("ObjVersion")
  private Integer objVersion = null;

  @SerializedName("Rows")
  private List<Mlbjourneyrow> rows = new ArrayList<Mlbjourneyrow>();

  @SerializedName("ThroughPlaces")
  private String throughPlaces = null;

  @SerializedName("DistanceCounted")
  private Double distanceCounted = null;

  @SerializedName("StartPlace_ID")
  private String startPlaceID = null;

  @SerializedName("EndPlace_ID")
  private String endPlaceID = null;

  @SerializedName("AndBack")
  private Boolean andBack = null;

  @SerializedName("Distance")
  private Double distance = null;

  @SerializedName("Firm_ID")
  private String firmID = null;

  @SerializedName("FirmOffice_ID")
  private String firmOfficeID = null;

  @SerializedName("Purpose_ID")
  private String purposeID = null;

  @SerializedName("TRMCar_ID")
  private String tRMCarID = null;

  @SerializedName("TRMDriver_ID")
  private String tRMDriverID = null;

  @SerializedName("RouteDateFrom$DATE")
  private DateTime routeDateFromDATE = null;

  @SerializedName("RouteDateTo$DATE")
  private DateTime routeDateToDATE = null;

  @SerializedName("MLBRoute_ID")
  private String mLBRouteID = null;

  @SerializedName("NewTachoSet")
  private Boolean newTachoSet = null;

  @SerializedName("TachoBegin")
  private Double tachoBegin = null;

  @SerializedName("StaffUse")
  private Boolean staffUse = null;

  @SerializedName("MLBBalance_ID")
  private String mLBBalanceID = null;

  @SerializedName("Passengers")
  private String passengers = null;

  @SerializedName("Description")
  private String description = null;

  @SerializedName("TankContent")
  private Double tankContent = null;

  @SerializedName("TankContentCorrection")
  private Double tankContentCorrection = null;

  @SerializedName("Division_ID")
  private String divisionID = null;

  @SerializedName("BusOrder_ID")
  private String busOrderID = null;

  @SerializedName("BusTransaction_ID")
  private String busTransactionID = null;

  @SerializedName("TotalFuelPrice")
  private Double totalFuelPrice = null;

  @SerializedName("TotalExpenses")
  private Double totalExpenses = null;

  @SerializedName("FuelQuantity")
  private Double fuelQuantity = null;

  @SerializedName("CreatedBy_ID")
  private String createdByID = null;

  @SerializedName("CorrectedBy_ID")
  private String correctedByID = null;

  @SerializedName("TachoEnd")
  private Double tachoEnd = null;

  @SerializedName("FuelConsumption")
  private Double fuelConsumption = null;

  @SerializedName("PreviousTankContent")
  private Double previousTankContent = null;

   /**
   * Název
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Název")
  public String getDisplayName() {
    return displayName;
  }

   /**
   * Vlastní ID [persistentní položka]
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "Vlastní ID [persistentní položka]")
  public String getID() {
    return ID;
  }

   /**
   * ID třídy
   * @return classID
  **/
  @ApiModelProperty(example = "null", value = "ID třídy")
  public String getClassID() {
    return classID;
  }

   /**
   * Verze objektu [persistentní položka]
   * @return objVersion
  **/
  @ApiModelProperty(example = "null", value = "Verze objektu [persistentní položka]")
  public Integer getObjVersion() {
    return objVersion;
  }

  public Mlbjourney rows(List<Mlbjourneyrow> rows) {
    this.rows = rows;
    return this;
  }

  public Mlbjourney addRowsItem(Mlbjourneyrow rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Řádky; kolekce BO Průjezdná místa [nepersistentní položka]
   * @return rows
  **/
  @ApiModelProperty(example = "null", value = "Řádky; kolekce BO Průjezdná místa [nepersistentní položka]")
  public List<Mlbjourneyrow> getRows() {
    return rows;
  }

  public void setRows(List<Mlbjourneyrow> rows) {
    this.rows = rows;
  }

  public Mlbjourney throughPlaces(String throughPlaces) {
    this.throughPlaces = throughPlaces;
    return this;
  }

   /**
   * Průjezdná místa
   * @return throughPlaces
  **/
  @ApiModelProperty(example = "null", value = "Průjezdná místa")
  public String getThroughPlaces() {
    return throughPlaces;
  }

  public void setThroughPlaces(String throughPlaces) {
    this.throughPlaces = throughPlaces;
  }

  public Mlbjourney distanceCounted(Double distanceCounted) {
    this.distanceCounted = distanceCounted;
    return this;
  }

   /**
   * Spočtená vzdálenost
   * @return distanceCounted
  **/
  @ApiModelProperty(example = "null", value = "Spočtená vzdálenost")
  public Double getDistanceCounted() {
    return distanceCounted;
  }

  public void setDistanceCounted(Double distanceCounted) {
    this.distanceCounted = distanceCounted;
  }

  public Mlbjourney startPlaceID(String startPlaceID) {
    this.startPlaceID = startPlaceID;
    return this;
  }

   /**
   * Výchozí místo; ID objektu Místa [persistentní položka]
   * @return startPlaceID
  **/
  @ApiModelProperty(example = "null", value = "Výchozí místo; ID objektu Místa [persistentní položka]")
  public String getStartPlaceID() {
    return startPlaceID;
  }

  public void setStartPlaceID(String startPlaceID) {
    this.startPlaceID = startPlaceID;
  }

  public Mlbjourney endPlaceID(String endPlaceID) {
    this.endPlaceID = endPlaceID;
    return this;
  }

   /**
   * Cílové místo; ID objektu Místa [persistentní položka]
   * @return endPlaceID
  **/
  @ApiModelProperty(example = "null", value = "Cílové místo; ID objektu Místa [persistentní položka]")
  public String getEndPlaceID() {
    return endPlaceID;
  }

  public void setEndPlaceID(String endPlaceID) {
    this.endPlaceID = endPlaceID;
  }

  public Mlbjourney andBack(Boolean andBack) {
    this.andBack = andBack;
    return this;
  }

   /**
   * Zpět [persistentní položka]
   * @return andBack
  **/
  @ApiModelProperty(example = "null", value = "Zpět [persistentní položka]")
  public Boolean getAndBack() {
    return andBack;
  }

  public void setAndBack(Boolean andBack) {
    this.andBack = andBack;
  }

  public Mlbjourney distance(Double distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Vzdálenost [persistentní položka]
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "Vzdálenost [persistentní položka]")
  public Double getDistance() {
    return distance;
  }

  public void setDistance(Double distance) {
    this.distance = distance;
  }

  public Mlbjourney firmID(String firmID) {
    this.firmID = firmID;
    return this;
  }

   /**
   * Firma; ID objektu Firma [persistentní položka]
   * @return firmID
  **/
  @ApiModelProperty(example = "null", value = "Firma; ID objektu Firma [persistentní položka]")
  public String getFirmID() {
    return firmID;
  }

  public void setFirmID(String firmID) {
    this.firmID = firmID;
  }

  public Mlbjourney firmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
    return this;
  }

   /**
   * Provozovna; ID objektu Provozovna [persistentní položka]
   * @return firmOfficeID
  **/
  @ApiModelProperty(example = "null", value = "Provozovna; ID objektu Provozovna [persistentní položka]")
  public String getFirmOfficeID() {
    return firmOfficeID;
  }

  public void setFirmOfficeID(String firmOfficeID) {
    this.firmOfficeID = firmOfficeID;
  }

  public Mlbjourney purposeID(String purposeID) {
    this.purposeID = purposeID;
    return this;
  }

   /**
   * Účel jízdy; ID objektu Účel jízdy [persistentní položka]
   * @return purposeID
  **/
  @ApiModelProperty(example = "null", value = "Účel jízdy; ID objektu Účel jízdy [persistentní položka]")
  public String getPurposeID() {
    return purposeID;
  }

  public void setPurposeID(String purposeID) {
    this.purposeID = purposeID;
  }

  public Mlbjourney tRMCarID(String tRMCarID) {
    this.tRMCarID = tRMCarID;
    return this;
  }

   /**
   * Vozidlo; ID objektu Vozidlo [persistentní položka]
   * @return tRMCarID
  **/
  @ApiModelProperty(example = "null", value = "Vozidlo; ID objektu Vozidlo [persistentní položka]")
  public String getTRMCarID() {
    return tRMCarID;
  }

  public void setTRMCarID(String tRMCarID) {
    this.tRMCarID = tRMCarID;
  }

  public Mlbjourney tRMDriverID(String tRMDriverID) {
    this.tRMDriverID = tRMDriverID;
    return this;
  }

   /**
   * Řidič; ID objektu Řidič [persistentní položka]
   * @return tRMDriverID
  **/
  @ApiModelProperty(example = "null", value = "Řidič; ID objektu Řidič [persistentní položka]")
  public String getTRMDriverID() {
    return tRMDriverID;
  }

  public void setTRMDriverID(String tRMDriverID) {
    this.tRMDriverID = tRMDriverID;
  }

  public Mlbjourney routeDateFromDATE(DateTime routeDateFromDATE) {
    this.routeDateFromDATE = routeDateFromDATE;
    return this;
  }

   /**
   * Den odjezdu [persistentní položka]
   * @return routeDateFromDATE
  **/
  @ApiModelProperty(example = "null", value = "Den odjezdu [persistentní položka]")
  public DateTime getRouteDateFromDATE() {
    return routeDateFromDATE;
  }

  public void setRouteDateFromDATE(DateTime routeDateFromDATE) {
    this.routeDateFromDATE = routeDateFromDATE;
  }

  public Mlbjourney routeDateToDATE(DateTime routeDateToDATE) {
    this.routeDateToDATE = routeDateToDATE;
    return this;
  }

   /**
   * Den příjezdu [persistentní položka]
   * @return routeDateToDATE
  **/
  @ApiModelProperty(example = "null", value = "Den příjezdu [persistentní položka]")
  public DateTime getRouteDateToDATE() {
    return routeDateToDATE;
  }

  public void setRouteDateToDATE(DateTime routeDateToDATE) {
    this.routeDateToDATE = routeDateToDATE;
  }

  public Mlbjourney mLBRouteID(String mLBRouteID) {
    this.mLBRouteID = mLBRouteID;
    return this;
  }

   /**
   * Vzor jízdy; ID objektu Vzor jízdy [persistentní položka]
   * @return mLBRouteID
  **/
  @ApiModelProperty(example = "null", value = "Vzor jízdy; ID objektu Vzor jízdy [persistentní položka]")
  public String getMLBRouteID() {
    return mLBRouteID;
  }

  public void setMLBRouteID(String mLBRouteID) {
    this.mLBRouteID = mLBRouteID;
  }

  public Mlbjourney newTachoSet(Boolean newTachoSet) {
    this.newTachoSet = newTachoSet;
    return this;
  }

   /**
   * Přednastavení stavu tachometru [persistentní položka]
   * @return newTachoSet
  **/
  @ApiModelProperty(example = "null", value = "Přednastavení stavu tachometru [persistentní položka]")
  public Boolean getNewTachoSet() {
    return newTachoSet;
  }

  public void setNewTachoSet(Boolean newTachoSet) {
    this.newTachoSet = newTachoSet;
  }

  public Mlbjourney tachoBegin(Double tachoBegin) {
    this.tachoBegin = tachoBegin;
    return this;
  }

   /**
   * Počáteční stav tachometru [persistentní položka]
   * @return tachoBegin
  **/
  @ApiModelProperty(example = "null", value = "Počáteční stav tachometru [persistentní položka]")
  public Double getTachoBegin() {
    return tachoBegin;
  }

  public void setTachoBegin(Double tachoBegin) {
    this.tachoBegin = tachoBegin;
  }

  public Mlbjourney staffUse(Boolean staffUse) {
    this.staffUse = staffUse;
    return this;
  }

   /**
   * Služebně [persistentní položka]
   * @return staffUse
  **/
  @ApiModelProperty(example = "null", value = "Služebně [persistentní položka]")
  public Boolean getStaffUse() {
    return staffUse;
  }

  public void setStaffUse(Boolean staffUse) {
    this.staffUse = staffUse;
  }

  public Mlbjourney mLBBalanceID(String mLBBalanceID) {
    this.mLBBalanceID = mLBBalanceID;
    return this;
  }

   /**
   * Uzavřeno; ID objektu Uzávěrka knihy jízd [persistentní položka]
   * @return mLBBalanceID
  **/
  @ApiModelProperty(example = "null", value = "Uzavřeno; ID objektu Uzávěrka knihy jízd [persistentní položka]")
  public String getMLBBalanceID() {
    return mLBBalanceID;
  }

  public void setMLBBalanceID(String mLBBalanceID) {
    this.mLBBalanceID = mLBBalanceID;
  }

  public Mlbjourney passengers(String passengers) {
    this.passengers = passengers;
    return this;
  }

   /**
   * Spolucestující [persistentní položka]
   * @return passengers
  **/
  @ApiModelProperty(example = "null", value = "Spolucestující [persistentní položka]")
  public String getPassengers() {
    return passengers;
  }

  public void setPassengers(String passengers) {
    this.passengers = passengers;
  }

  public Mlbjourney description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Poznámka [persistentní položka]
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Poznámka [persistentní položka]")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Mlbjourney tankContent(Double tankContent) {
    this.tankContent = tankContent;
    return this;
  }

   /**
   * Stav nádrže [persistentní položka]
   * @return tankContent
  **/
  @ApiModelProperty(example = "null", value = "Stav nádrže [persistentní položka]")
  public Double getTankContent() {
    return tankContent;
  }

  public void setTankContent(Double tankContent) {
    this.tankContent = tankContent;
  }

  public Mlbjourney tankContentCorrection(Double tankContentCorrection) {
    this.tankContentCorrection = tankContentCorrection;
    return this;
  }

   /**
   * Korekce stavu nádrže [persistentní položka]
   * @return tankContentCorrection
  **/
  @ApiModelProperty(example = "null", value = "Korekce stavu nádrže [persistentní položka]")
  public Double getTankContentCorrection() {
    return tankContentCorrection;
  }

  public void setTankContentCorrection(Double tankContentCorrection) {
    this.tankContentCorrection = tankContentCorrection;
  }

  public Mlbjourney divisionID(String divisionID) {
    this.divisionID = divisionID;
    return this;
  }

   /**
   * Středisko; ID objektu Středisko [persistentní položka]
   * @return divisionID
  **/
  @ApiModelProperty(example = "null", value = "Středisko; ID objektu Středisko [persistentní položka]")
  public String getDivisionID() {
    return divisionID;
  }

  public void setDivisionID(String divisionID) {
    this.divisionID = divisionID;
  }

  public Mlbjourney busOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
    return this;
  }

   /**
   * Zakázka; ID objektu Zakázka [persistentní položka]
   * @return busOrderID
  **/
  @ApiModelProperty(example = "null", value = "Zakázka; ID objektu Zakázka [persistentní položka]")
  public String getBusOrderID() {
    return busOrderID;
  }

  public void setBusOrderID(String busOrderID) {
    this.busOrderID = busOrderID;
  }

  public Mlbjourney busTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
    return this;
  }

   /**
   * Obch.případ; ID objektu Obchodní případ [persistentní položka]
   * @return busTransactionID
  **/
  @ApiModelProperty(example = "null", value = "Obch.případ; ID objektu Obchodní případ [persistentní položka]")
  public String getBusTransactionID() {
    return busTransactionID;
  }

  public void setBusTransactionID(String busTransactionID) {
    this.busTransactionID = busTransactionID;
  }

  public Mlbjourney totalFuelPrice(Double totalFuelPrice) {
    this.totalFuelPrice = totalFuelPrice;
    return this;
  }

   /**
   * Celková cena za PHM [persistentní položka]
   * @return totalFuelPrice
  **/
  @ApiModelProperty(example = "null", value = "Celková cena za PHM [persistentní položka]")
  public Double getTotalFuelPrice() {
    return totalFuelPrice;
  }

  public void setTotalFuelPrice(Double totalFuelPrice) {
    this.totalFuelPrice = totalFuelPrice;
  }

  public Mlbjourney totalExpenses(Double totalExpenses) {
    this.totalExpenses = totalExpenses;
    return this;
  }

   /**
   * Celková cena za jízdu [persistentní položka]
   * @return totalExpenses
  **/
  @ApiModelProperty(example = "null", value = "Celková cena za jízdu [persistentní položka]")
  public Double getTotalExpenses() {
    return totalExpenses;
  }

  public void setTotalExpenses(Double totalExpenses) {
    this.totalExpenses = totalExpenses;
  }

  public Mlbjourney fuelQuantity(Double fuelQuantity) {
    this.fuelQuantity = fuelQuantity;
    return this;
  }

   /**
   * Celkové čerpání za jízdu [persistentní položka]
   * @return fuelQuantity
  **/
  @ApiModelProperty(example = "null", value = "Celkové čerpání za jízdu [persistentní položka]")
  public Double getFuelQuantity() {
    return fuelQuantity;
  }

  public void setFuelQuantity(Double fuelQuantity) {
    this.fuelQuantity = fuelQuantity;
  }

  public Mlbjourney createdByID(String createdByID) {
    this.createdByID = createdByID;
    return this;
  }

   /**
   * Vytvořil; ID objektu Uživatel [persistentní položka]
   * @return createdByID
  **/
  @ApiModelProperty(example = "null", value = "Vytvořil; ID objektu Uživatel [persistentní položka]")
  public String getCreatedByID() {
    return createdByID;
  }

  public void setCreatedByID(String createdByID) {
    this.createdByID = createdByID;
  }

  public Mlbjourney correctedByID(String correctedByID) {
    this.correctedByID = correctedByID;
    return this;
  }

   /**
   * Opravil; ID objektu Uživatel [persistentní položka]
   * @return correctedByID
  **/
  @ApiModelProperty(example = "null", value = "Opravil; ID objektu Uživatel [persistentní položka]")
  public String getCorrectedByID() {
    return correctedByID;
  }

  public void setCorrectedByID(String correctedByID) {
    this.correctedByID = correctedByID;
  }

  public Mlbjourney tachoEnd(Double tachoEnd) {
    this.tachoEnd = tachoEnd;
    return this;
  }

   /**
   * Konečný stav tachometru
   * @return tachoEnd
  **/
  @ApiModelProperty(example = "null", value = "Konečný stav tachometru")
  public Double getTachoEnd() {
    return tachoEnd;
  }

  public void setTachoEnd(Double tachoEnd) {
    this.tachoEnd = tachoEnd;
  }

  public Mlbjourney fuelConsumption(Double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
    return this;
  }

   /**
   * Spotřeba PHM
   * @return fuelConsumption
  **/
  @ApiModelProperty(example = "null", value = "Spotřeba PHM")
  public Double getFuelConsumption() {
    return fuelConsumption;
  }

  public void setFuelConsumption(Double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public Mlbjourney previousTankContent(Double previousTankContent) {
    this.previousTankContent = previousTankContent;
    return this;
  }

   /**
   * Počáteční stav nádrže
   * @return previousTankContent
  **/
  @ApiModelProperty(example = "null", value = "Počáteční stav nádrže")
  public Double getPreviousTankContent() {
    return previousTankContent;
  }

  public void setPreviousTankContent(Double previousTankContent) {
    this.previousTankContent = previousTankContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mlbjourney mlbjourney = (Mlbjourney) o;
    return Objects.equals(this.displayName, mlbjourney.displayName) &&
        Objects.equals(this.ID, mlbjourney.ID) &&
        Objects.equals(this.classID, mlbjourney.classID) &&
        Objects.equals(this.objVersion, mlbjourney.objVersion) &&
        Objects.equals(this.rows, mlbjourney.rows) &&
        Objects.equals(this.throughPlaces, mlbjourney.throughPlaces) &&
        Objects.equals(this.distanceCounted, mlbjourney.distanceCounted) &&
        Objects.equals(this.startPlaceID, mlbjourney.startPlaceID) &&
        Objects.equals(this.endPlaceID, mlbjourney.endPlaceID) &&
        Objects.equals(this.andBack, mlbjourney.andBack) &&
        Objects.equals(this.distance, mlbjourney.distance) &&
        Objects.equals(this.firmID, mlbjourney.firmID) &&
        Objects.equals(this.firmOfficeID, mlbjourney.firmOfficeID) &&
        Objects.equals(this.purposeID, mlbjourney.purposeID) &&
        Objects.equals(this.tRMCarID, mlbjourney.tRMCarID) &&
        Objects.equals(this.tRMDriverID, mlbjourney.tRMDriverID) &&
        Objects.equals(this.routeDateFromDATE, mlbjourney.routeDateFromDATE) &&
        Objects.equals(this.routeDateToDATE, mlbjourney.routeDateToDATE) &&
        Objects.equals(this.mLBRouteID, mlbjourney.mLBRouteID) &&
        Objects.equals(this.newTachoSet, mlbjourney.newTachoSet) &&
        Objects.equals(this.tachoBegin, mlbjourney.tachoBegin) &&
        Objects.equals(this.staffUse, mlbjourney.staffUse) &&
        Objects.equals(this.mLBBalanceID, mlbjourney.mLBBalanceID) &&
        Objects.equals(this.passengers, mlbjourney.passengers) &&
        Objects.equals(this.description, mlbjourney.description) &&
        Objects.equals(this.tankContent, mlbjourney.tankContent) &&
        Objects.equals(this.tankContentCorrection, mlbjourney.tankContentCorrection) &&
        Objects.equals(this.divisionID, mlbjourney.divisionID) &&
        Objects.equals(this.busOrderID, mlbjourney.busOrderID) &&
        Objects.equals(this.busTransactionID, mlbjourney.busTransactionID) &&
        Objects.equals(this.totalFuelPrice, mlbjourney.totalFuelPrice) &&
        Objects.equals(this.totalExpenses, mlbjourney.totalExpenses) &&
        Objects.equals(this.fuelQuantity, mlbjourney.fuelQuantity) &&
        Objects.equals(this.createdByID, mlbjourney.createdByID) &&
        Objects.equals(this.correctedByID, mlbjourney.correctedByID) &&
        Objects.equals(this.tachoEnd, mlbjourney.tachoEnd) &&
        Objects.equals(this.fuelConsumption, mlbjourney.fuelConsumption) &&
        Objects.equals(this.previousTankContent, mlbjourney.previousTankContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, ID, classID, objVersion, rows, throughPlaces, distanceCounted, startPlaceID, endPlaceID, andBack, distance, firmID, firmOfficeID, purposeID, tRMCarID, tRMDriverID, routeDateFromDATE, routeDateToDATE, mLBRouteID, newTachoSet, tachoBegin, staffUse, mLBBalanceID, passengers, description, tankContent, tankContentCorrection, divisionID, busOrderID, busTransactionID, totalFuelPrice, totalExpenses, fuelQuantity, createdByID, correctedByID, tachoEnd, fuelConsumption, previousTankContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mlbjourney {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    objVersion: ").append(toIndentedString(objVersion)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    throughPlaces: ").append(toIndentedString(throughPlaces)).append("\n");
    sb.append("    distanceCounted: ").append(toIndentedString(distanceCounted)).append("\n");
    sb.append("    startPlaceID: ").append(toIndentedString(startPlaceID)).append("\n");
    sb.append("    endPlaceID: ").append(toIndentedString(endPlaceID)).append("\n");
    sb.append("    andBack: ").append(toIndentedString(andBack)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    firmID: ").append(toIndentedString(firmID)).append("\n");
    sb.append("    firmOfficeID: ").append(toIndentedString(firmOfficeID)).append("\n");
    sb.append("    purposeID: ").append(toIndentedString(purposeID)).append("\n");
    sb.append("    tRMCarID: ").append(toIndentedString(tRMCarID)).append("\n");
    sb.append("    tRMDriverID: ").append(toIndentedString(tRMDriverID)).append("\n");
    sb.append("    routeDateFromDATE: ").append(toIndentedString(routeDateFromDATE)).append("\n");
    sb.append("    routeDateToDATE: ").append(toIndentedString(routeDateToDATE)).append("\n");
    sb.append("    mLBRouteID: ").append(toIndentedString(mLBRouteID)).append("\n");
    sb.append("    newTachoSet: ").append(toIndentedString(newTachoSet)).append("\n");
    sb.append("    tachoBegin: ").append(toIndentedString(tachoBegin)).append("\n");
    sb.append("    staffUse: ").append(toIndentedString(staffUse)).append("\n");
    sb.append("    mLBBalanceID: ").append(toIndentedString(mLBBalanceID)).append("\n");
    sb.append("    passengers: ").append(toIndentedString(passengers)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tankContent: ").append(toIndentedString(tankContent)).append("\n");
    sb.append("    tankContentCorrection: ").append(toIndentedString(tankContentCorrection)).append("\n");
    sb.append("    divisionID: ").append(toIndentedString(divisionID)).append("\n");
    sb.append("    busOrderID: ").append(toIndentedString(busOrderID)).append("\n");
    sb.append("    busTransactionID: ").append(toIndentedString(busTransactionID)).append("\n");
    sb.append("    totalFuelPrice: ").append(toIndentedString(totalFuelPrice)).append("\n");
    sb.append("    totalExpenses: ").append(toIndentedString(totalExpenses)).append("\n");
    sb.append("    fuelQuantity: ").append(toIndentedString(fuelQuantity)).append("\n");
    sb.append("    createdByID: ").append(toIndentedString(createdByID)).append("\n");
    sb.append("    correctedByID: ").append(toIndentedString(correctedByID)).append("\n");
    sb.append("    tachoEnd: ").append(toIndentedString(tachoEnd)).append("\n");
    sb.append("    fuelConsumption: ").append(toIndentedString(fuelConsumption)).append("\n");
    sb.append("    previousTankContent: ").append(toIndentedString(previousTankContent)).append("\n");
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

