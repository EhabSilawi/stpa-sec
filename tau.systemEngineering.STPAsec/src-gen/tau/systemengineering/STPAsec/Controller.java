/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getCommands <em>Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.Controller#getFeedbacks <em>Feedbacks</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends StructureElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.Controller#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Commands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getReceiver
	 * @model opposite="receiver"
	 * @generated
	 */
	EList<ControlAction> getCommands();

	/**
	 * Returns the value of the '<em><b>Feedbacks</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedbacks</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getController_Feedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getController
	 * @model opposite="controller"
	 * @generated
	 */
	EList<Feedback> getFeedbacks();

} // Controller
