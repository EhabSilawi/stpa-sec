/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.System#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getGoals <em>Goals</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getPotentialHazards <em>Potential Hazards</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Controller {
	/**
	 * Returns the value of the '<em><b>Recommends</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SecurityRecommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommends</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Recommends()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRecommendation> getRecommends();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.MissionGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Goals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MissionGoal> getGoals();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.LossScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<LossScenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ControlStructure> getConsistsOf();

	/**
	 * Returns the value of the '<em><b>Potential Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Hazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Potential Hazards</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_PotentialHazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hazard> getPotentialHazards();

} // System
