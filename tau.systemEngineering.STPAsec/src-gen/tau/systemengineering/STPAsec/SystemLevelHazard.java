/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Level Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getRefineHazards <em>Refine Hazards</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getLeadsTo <em>Leads To</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getUnsecureCondition <em>Unsecure Condition</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getSystem <em>System</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.SystemLevelHazard#getICA <em>ICA</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard()
 * @model
 * @generated
 */
public interface SystemLevelHazard extends EObject {
	/**
	 * Returns the value of the '<em><b>Refine Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelHazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refine Hazards</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_RefineHazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemLevelHazard> getRefineHazards();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Leads To</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Loss}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Loss#getTraceableTo <em>Traceable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leads To</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_LeadsTo()
	 * @see tau.systemengineering.STPAsec.Loss#getTraceableTo
	 * @model opposite="traceableTo" required="true"
	 * @generated
	 */
	EList<Loss> getLeadsTo();

	/**
	 * Returns the value of the '<em><b>Unsecure Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsecure Condition</em>' attribute.
	 * @see #setUnsecureCondition(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_UnsecureCondition()
	 * @model
	 * @generated
	 */
	String getUnsecureCondition();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getUnsecureCondition <em>Unsecure Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsecure Condition</em>' attribute.
	 * @see #getUnsecureCondition()
	 * @generated
	 */
	void setUnsecureCondition(String value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelConstraint}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.SystemLevelConstraint#getTraceableTo <em>Traceable To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_Constraint()
	 * @see tau.systemengineering.STPAsec.SystemLevelConstraint#getTraceableTo
	 * @model opposite="traceableTo" required="true"
	 * @generated
	 */
	EList<SystemLevelConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_System()
	 * @model required="true"
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getSystem();

	/**
	 * Returns the value of the '<em><b>ICA</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.InsecureControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.InsecureControlAction#getLinkToHazrd <em>Link To Hazrd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICA</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getSystemLevelHazard_ICA()
	 * @see tau.systemengineering.STPAsec.InsecureControlAction#getLinkToHazrd
	 * @model opposite="linkToHazrd" required="true"
	 * @generated
	 */
	EList<InsecureControlAction> getICA();

} // SystemLevelHazard
