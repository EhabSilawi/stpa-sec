/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getName <em>Name</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getModelGoal <em>Model Goal</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getDescription <em>Description</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getControlledprocess <em>Controlledprocess</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getControlaction <em>Controlaction</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getFeedback <em>Feedback</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks <em>Sends Feedbacks</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getControllerSendsInfo <em>Controller Sends Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure()
 * @model
 * @generated
 */
public interface ControlStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Goal</em>' attribute.
	 * @see #setModelGoal(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_ModelGoal()
	 * @model
	 * @generated
	 */
	String getModelGoal();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlStructure#getModelGoal <em>Model Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Goal</em>' attribute.
	 * @see #getModelGoal()
	 * @generated
	 */
	void setModelGoal(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlStructure#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Controller()
	 * @model
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getController();

	/**
	 * Returns the value of the '<em><b>Controlledprocess</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlledProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlledprocess</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Controlledprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlledProcess> getControlledprocess();

	/**
	 * Returns the value of the '<em><b>Controlaction</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controlaction</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Controlaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlAction> getControlaction();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Feedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getFeedback();

	/**
	 * Returns the value of the '<em><b>Sends Feedbacks</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getControllerFeedbackReceiver <em>Controller Feedback Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Feedbacks</em>' reference.
	 * @see #setSendsFeedbacks(Feedback)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SendsFeedbacks()
	 * @see tau.systemengineering.STPAsec.Feedback#getControllerFeedbackReceiver
	 * @model opposite="controllerFeedbackReceiver"
	 * @generated
	 */
	Feedback getSendsFeedbacks();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsFeedbacks <em>Sends Feedbacks</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends Feedbacks</em>' reference.
	 * @see #getSendsFeedbacks()
	 * @generated
	 */
	void setSendsFeedbacks(Feedback value);

	/**
	 * Returns the value of the '<em><b>Sends Commands</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getControllerCommandReceiver <em>Controller Command Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Commands</em>' reference.
	 * @see #setSendsCommands(ControlAction)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SendsCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getControllerCommandReceiver
	 * @model opposite="controllerCommandReceiver"
	 * @generated
	 */
	ControlAction getSendsCommands();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sends Commands</em>' reference.
	 * @see #getSendsCommands()
	 * @generated
	 */
	void setSendsCommands(ControlAction value);

	/**
	 * Returns the value of the '<em><b>Controller Sends Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getCcontrollerReceiverInfo <em>Ccontroller Receiver Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Sends Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_ControllerSendsInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getCcontrollerReceiverInfo
	 * @model opposite="ccontrollerReceiverInfo"
	 * @generated
	 */
	EList<OtherInformation> getControllerSendsInfo();

} // ControlStructure
