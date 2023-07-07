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
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getController <em>Controller</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemModel <em>Subsystem Model</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getOtherinformation <em>Otherinformation</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemSenders <em>Subsystem Senders</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSubsystemsReceivers <em>Subsystems Receivers</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSwndsInfor <em>Swnds Infor</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesInfo <em>Receives Info</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getSendsCommands <em>Sends Commands</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.ControlStructure#getReceivesCommands <em>Receives Commands</em>}</li>
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
	 * Returns the value of the '<em><b>Controller</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Controller()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getController();

	/**
	 * Returns the value of the '<em><b>Subsystem Model</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Model</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SubsystemModel()
	 * @model containment="true"
	 * @generated
	 */
	EList<tau.systemengineering.STPAsec.System> getSubsystemModel();

	/**
	 * Returns the value of the '<em><b>Otherinformation</b></em>' containment reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherinformation</em>' containment reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_Otherinformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OtherInformation> getOtherinformation();

	/**
	 * Returns the value of the '<em><b>Subsystem Senders</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getSendsFeedbacks <em>Sends Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem Senders</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SubsystemSenders()
	 * @see tau.systemengineering.STPAsec.Feedback#getSendsFeedbacks
	 * @model opposite="sendsFeedbacks"
	 * @generated
	 */
	EList<Feedback> getSubsystemSenders();

	/**
	 * Returns the value of the '<em><b>Subsystems Receivers</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Feedback}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.Feedback#getReceiversFeedbacks <em>Receivers Feedbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems Receivers</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SubsystemsReceivers()
	 * @see tau.systemengineering.STPAsec.Feedback#getReceiversFeedbacks
	 * @model opposite="receiversFeedbacks"
	 * @generated
	 */
	EList<Feedback> getSubsystemsReceivers();

	/**
	 * Returns the value of the '<em><b>Swnds Infor</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swnds Infor</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SwndsInfor()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getSubsystemSenders
	 * @model opposite="subsystemSenders"
	 * @generated
	 */
	EList<OtherInformation> getSwndsInfor();

	/**
	 * Returns the value of the '<em><b>Receives Info</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.OtherInformation}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers <em>Subsystem Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Info</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_ReceivesInfo()
	 * @see tau.systemengineering.STPAsec.OtherInformation#getSubsystemReceivers
	 * @model opposite="subsystemReceivers"
	 * @generated
	 */
	EList<OtherInformation> getReceivesInfo();

	/**
	 * Returns the value of the '<em><b>Sends Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemSenders <em>Subsystem Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_SendsCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getSubsystemSenders
	 * @model opposite="subsystemSenders"
	 * @generated
	 */
	EList<ControlAction> getSendsCommands();

	/**
	 * Returns the value of the '<em><b>Receives Commands</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.ControlAction}.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.ControlAction#getSubsystemReceivers <em>Subsystem Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receives Commands</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getControlStructure_ReceivesCommands()
	 * @see tau.systemengineering.STPAsec.ControlAction#getSubsystemReceivers
	 * @model opposite="subsystemReceivers"
	 * @generated
	 */
	EList<ControlAction> getReceivesCommands();

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

} // ControlStructure
