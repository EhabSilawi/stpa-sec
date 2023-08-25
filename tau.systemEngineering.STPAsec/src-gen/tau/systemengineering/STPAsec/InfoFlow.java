/**
 */
package tau.systemengineering.STPAsec;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Info Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.InfoFlow#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InfoFlow#getInformation <em>Information</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver <em>Info Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.InfoFlow#getInfoSender <em>Info Sender</em>}</li>
 * </ul>
 *
 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInfoFlow()
 * @model
 * @generated
 */
public interface InfoFlow extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInfoFlow_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InfoFlow#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Information</b></em>' reference list.
	 * The list contents are of type {@link tau.systemengineering.STPAsec.Information}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information</em>' reference list.
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInfoFlow_Information()
	 * @model required="true"
	 * @generated
	 */
	EList<Information> getInformation();

	/**
	 * Returns the value of the '<em><b>Info Receiver</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getReceivesInfo <em>Receives Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Receiver</em>' reference.
	 * @see #setInfoReceiver(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInfoFlow_InfoReceiver()
	 * @see tau.systemengineering.STPAsec.System#getReceivesInfo
	 * @model opposite="receivesInfo"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getInfoReceiver();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoReceiver <em>Info Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Receiver</em>' reference.
	 * @see #getInfoReceiver()
	 * @generated
	 */
	void setInfoReceiver(tau.systemengineering.STPAsec.System value);

	/**
	 * Returns the value of the '<em><b>Info Sender</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tau.systemengineering.STPAsec.System#getSendsInfo <em>Sends Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info Sender</em>' reference.
	 * @see #setInfoSender(tau.systemengineering.STPAsec.System)
	 * @see tau.systemengineering.STPAsec.STPAsecPackage#getInfoFlow_InfoSender()
	 * @see tau.systemengineering.STPAsec.System#getSendsInfo
	 * @model opposite="sendsInfo"
	 * @generated
	 */
	tau.systemengineering.STPAsec.System getInfoSender();

	/**
	 * Sets the value of the '{@link tau.systemengineering.STPAsec.InfoFlow#getInfoSender <em>Info Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info Sender</em>' reference.
	 * @see #getInfoSender()
	 * @generated
	 */
	void setInfoSender(tau.systemengineering.STPAsec.System value);

} // InfoFlow
