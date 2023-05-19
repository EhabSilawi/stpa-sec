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
 *   <li>{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getRecomends <em>Recomends</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getGoals <em>Goals</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getScenario <em>Scenario</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getConsistsOf <em>Consists Of</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.System#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getName <em>Name</em>}' attribute.
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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Recomends()
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
	 * Returns the value of the '<em><b>Consists Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consists Of</em>' containment reference.
	 * @see #setConsistsOf(ControlStructure)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_ConsistsOf()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ControlStructure getConsistsOf();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getConsistsOf <em>Consists Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consists Of</em>' containment reference.
	 * @see #getConsistsOf()
	 * @generated
	 */
	void setConsistsOf(ControlStructure value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.System#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Hazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystem_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hazard> getCauses();

} // System
