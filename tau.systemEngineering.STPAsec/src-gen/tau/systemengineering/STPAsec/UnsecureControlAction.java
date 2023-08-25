/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsecure Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getSyaSource <em>Sya Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getContext <em>Context</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getSource <em>Source</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getLinkToHazrd <em>Link To Hazrd</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.UnsecureControlAction#getControlAction <em>Control Action</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction()
 * @model
 * @generated
 */
public interface UnsecureControlAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Sya Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sya Source</em>' reference.
	 * @see #setSyaSource(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_SyaSource()
	 * @model
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getSyaSource();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getSyaSource <em>Sya Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sya Source</em>' reference.
	 * @see #getSyaSource()
	 * @generated
	 */
	void setSyaSource(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link tau.systemengineering.STPAsec.TypeOfUnsecureControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see tau.systemengineering.STPAsec.TypeOfUnsecureControlAction
	 * @see #setType(TypeOfUnsecureControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_Type()
	 * @model
	 * @generated
	 */
	TypeOfUnsecureControlAction getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getType <em>Type</em>}' attribute.
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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getContext <em>Context</em>}' attribute.
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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_Source()
	 * @model
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getSource();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Link To Hazrd</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.SystemLevelHazard#getUCA <em>UCA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link To Hazrd</em>' reference.
	 * @see #setLinkToHazrd(SystemLevelHazard)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_LinkToHazrd()
	 * @see tau.systemengineering.STPAsec.SystemLevelHazard#getUCA
	 * @model opposite="UCA" required="true"
	 * @generated
	 */
	SystemLevelHazard getLinkToHazrd();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getLinkToHazrd <em>Link To Hazrd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link To Hazrd</em>' reference.
	 * @see #getLinkToHazrd()
	 * @generated
	 */
	void setLinkToHazrd(SystemLevelHazard value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getId <em>Id</em>}' attribute.
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
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getUnsecureControlAction_ControlAction()
	 * @model
	 * @generated
	 */
	ControlAction getControlAction();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.UnsecureControlAction#getControlAction <em>Control Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Action</em>' reference.
	 * @see #getControlAction()
	 * @generated
	 */
	void setControlAction(ControlAction value);

} // UnsecureControlAction
