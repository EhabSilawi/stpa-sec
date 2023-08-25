/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STPA Sec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getLoss <em>Loss</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getSystemLevelHazard <em>System Level Hazard</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getSystemLevelConstraint <em>System Level Constraint</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.STPASec#getInsecureControlAction <em>Insecure Control Action</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec()
 * @model
 * @generated
 */
public interface STPASec extends EObject {

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_System()
	 * @model containment="true"
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getSystem();

	/**
	 * Returns the value of the '<em><b>Loss</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Loss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_Loss()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Loss> getLoss();

	/**
	 * Returns the value of the '<em><b>System Level Hazard</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelHazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Level Hazard</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_SystemLevelHazard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SystemLevelHazard> getSystemLevelHazard();

	/**
	 * Returns the value of the '<em><b>System Level Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Level Constraint</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_SystemLevelConstraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SystemLevelConstraint> getSystemLevelConstraint();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Insecure Control Action</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.InsecureControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insecure Control Action</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_InsecureControlAction()
	 * @model containment="true"
	 * @generated
	 */
	EList<InsecureControlAction> getInsecureControlAction();

	/**
	 * Returns the value of the '<em><b>Systems</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systems</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSTPASec_Systems()
	 * @model containment="true"
	 * @generated
	 */
} // STPASec
