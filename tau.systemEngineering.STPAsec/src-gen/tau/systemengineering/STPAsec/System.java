/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link tau.systemengineering.STPAsec.System#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getSubSystem <em>Sub System</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
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

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_System()
	 * @see tau.systemengineering.STPAsec.System#getSubSystem
	 * @model opposite="subSystem"
	 * @generated
	 */
	System getSystem();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(System value);

	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_SubSystem()
	 * @see tau.systemengineering.STPAsec.System#getSystem
	 * @model opposite="system"
	 * @generated
	 */
	EList<System> getSubSystem();

} // System
