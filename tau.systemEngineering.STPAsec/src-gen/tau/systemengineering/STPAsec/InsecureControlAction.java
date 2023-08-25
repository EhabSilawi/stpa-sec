/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insecure Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getContext <em>Context</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getSource <em>Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getLinkToHazrd <em>Link To Hazrd</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InsecureControlAction#getCmdflow <em>Cmdflow</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction()
 * @model
 * @generated
 */
public interface InsecureControlAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tau.systemengineering.STPAsec.TypeOfUnsecureControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
	 * @see #setType(TypeOfUnsecureControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_Type()
	 * @model
	 * @generated
	 */
	TypeOfUnsecureControlAction getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeOfUnsecureControlAction value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_Source()
	 * @model required="true" derived="true"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getSource();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Link To Hazrd</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.SystemLevelHazard}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getICA <em>ICA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Hazrd</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_LinkToHazrd()
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getICA
	 * @model opposite="ICA" required="true"
	 * @generated
	 */
	EList<SystemLevelHazard> getLinkToHazrd();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Control Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Action</em>' reference.
	 * @see #setControlAction(ControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_ControlAction()
	 * @model required="true" derived="true"
	 * @generated
	 */
	ControlAction getControlAction();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getControlAction <em>Control Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Action</em>' reference.
	 * @see #getControlAction()
	 * @generated
	 */
	void setControlAction(ControlAction value);

	/**
	 * Returns the value of the '<em><b>Cmdflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdflow</em>' reference.
	 * @see #setCmdflow(CmdFlow)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInsecureControlAction_Cmdflow()
	 * @model
	 * @generated
	 */
	CmdFlow getCmdflow();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InsecureControlAction#getCmdflow <em>Cmdflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmdflow</em>' reference.
	 * @see #getCmdflow()
	 * @generated
	 */
	void setCmdflow(CmdFlow value);

} // InsecureControlAction
