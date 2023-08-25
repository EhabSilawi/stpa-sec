/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Level Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getConditionToEnforce <em>Condition To Enforce</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getTraceableTo <em>Traceable To</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelConstraint()
 * @model
 * @generated
 */
public interface SystemLevelConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelConstraint_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Condition To Enforce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition To Enforce</em>' attribute.
	 * @see #setConditionToEnforce(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelConstraint_ConditionToEnforce()
	 * @model
	 * @generated
	 */
	String getConditionToEnforce();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getConditionToEnforce <em>Condition To Enforce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition To Enforce</em>' attribute.
	 * @see #getConditionToEnforce()
	 * @generated
	 */
	void setConditionToEnforce(String value);

	/**
	 * Returns the value of the '<em><b>Traceable To</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelHazard}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceable To</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelConstraint_TraceableTo()
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getConstraint
	 * @model opposite="constraint" required="true"
	 * @generated
	 */
	EList<SystemLevelHazard> getTraceableTo();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelConstraint_System()
	 * @model
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getSystem();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(tau.systemengineering.STPAsec.System value);

} // SystemLevelConstraint
