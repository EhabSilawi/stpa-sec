/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Mission#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Mission#getRecomends <em>Recomends</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Mission#getGoals <em>Goals</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Mission#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Mission#getConsistsOf <em>Consists Of</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Mission#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recomends</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SecurityRecomendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recomends</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission_Recomends()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRecomendation> getRecomends();

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.MissionGoal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission_Goals()
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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission_Scenario()
	 * @model containment="true"
	 * @generated
	 */
	EList<LossScenario> getScenario();

	/**
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference.
	 * @see #setConsistsOf(ControlStructure)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getMission_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlStructure getConsistsOf();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Mission#getConsistsOf <em>Consists Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consists Of</em>' containment reference.
	 * @see #getConsistsOf()
	 * @generated
	 */
	void setConsistsOf(ControlStructure value);

} // Mission
