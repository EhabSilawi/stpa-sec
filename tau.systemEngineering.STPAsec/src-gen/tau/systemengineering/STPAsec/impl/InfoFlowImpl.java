/**
 */
package tau.systemengineering.STPAsec.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import tau.systemengineering.STPAsec.InfoFlow;
import tau.systemengineering.STPAsec.Information;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl#getInformation <em>Information</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl#getInfoReceiver <em>Info Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.InfoFlowImpl#getInfoSender <em>Info Sender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfoFlowImpl extends MinimalEObjectImpl.Container implements InfoFlow {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInformation() <em>Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> information;

	/**
	 * The cached value of the '{@link #getInfoReceiver() <em>Info Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoReceiver()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System infoReceiver;

	/**
	 * The cached value of the '{@link #getInfoSender() <em>Info Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfoSender()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System infoSender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.INFO_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INFO_FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformation() {
		if (information == null) {
			information = new EObjectResolvingEList<Information>(Information.class, this,
					STPAsecPackage.INFO_FLOW__INFORMATION);
		}
		return information;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getInfoReceiver() {
		if (infoReceiver != null && infoReceiver.eIsProxy()) {
			InternalEObject oldInfoReceiver = (InternalEObject) infoReceiver;
			infoReceiver = (tau.systemengineering.STPAsec.System) eResolveProxy(oldInfoReceiver);
			if (infoReceiver != oldInfoReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.INFO_FLOW__INFO_RECEIVER,
							oldInfoReceiver, infoReceiver));
			}
		}
		return infoReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetInfoReceiver() {
		return infoReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfoReceiver(tau.systemengineering.STPAsec.System newInfoReceiver,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldInfoReceiver = infoReceiver;
		infoReceiver = newInfoReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.INFO_FLOW__INFO_RECEIVER, oldInfoReceiver, newInfoReceiver);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoReceiver(tau.systemengineering.STPAsec.System newInfoReceiver) {
		if (newInfoReceiver != infoReceiver) {
			NotificationChain msgs = null;
			if (infoReceiver != null)
				msgs = ((InternalEObject) infoReceiver).eInverseRemove(this, STPAsecPackage.SYSTEM__RECEIVES_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			if (newInfoReceiver != null)
				msgs = ((InternalEObject) newInfoReceiver).eInverseAdd(this, STPAsecPackage.SYSTEM__RECEIVES_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetInfoReceiver(newInfoReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INFO_FLOW__INFO_RECEIVER,
					newInfoReceiver, newInfoReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getInfoSender() {
		if (infoSender != null && infoSender.eIsProxy()) {
			InternalEObject oldInfoSender = (InternalEObject) infoSender;
			infoSender = (tau.systemengineering.STPAsec.System) eResolveProxy(oldInfoSender);
			if (infoSender != oldInfoSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.INFO_FLOW__INFO_SENDER,
							oldInfoSender, infoSender));
			}
		}
		return infoSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetInfoSender() {
		return infoSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfoSender(tau.systemengineering.STPAsec.System newInfoSender,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldInfoSender = infoSender;
		infoSender = newInfoSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.INFO_FLOW__INFO_SENDER, oldInfoSender, newInfoSender);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfoSender(tau.systemengineering.STPAsec.System newInfoSender) {
		if (newInfoSender != infoSender) {
			NotificationChain msgs = null;
			if (infoSender != null)
				msgs = ((InternalEObject) infoSender).eInverseRemove(this, STPAsecPackage.SYSTEM__SENDS_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			if (newInfoSender != null)
				msgs = ((InternalEObject) newInfoSender).eInverseAdd(this, STPAsecPackage.SYSTEM__SENDS_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetInfoSender(newInfoSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.INFO_FLOW__INFO_SENDER, newInfoSender,
					newInfoSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			if (infoReceiver != null)
				msgs = ((InternalEObject) infoReceiver).eInverseRemove(this, STPAsecPackage.SYSTEM__RECEIVES_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetInfoReceiver((tau.systemengineering.STPAsec.System) otherEnd, msgs);
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			if (infoSender != null)
				msgs = ((InternalEObject) infoSender).eInverseRemove(this, STPAsecPackage.SYSTEM__SENDS_INFO,
						tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetInfoSender((tau.systemengineering.STPAsec.System) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			return basicSetInfoReceiver(null, msgs);
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			return basicSetInfoSender(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__ID:
			return getId();
		case STPAsecPackage.INFO_FLOW__INFORMATION:
			return getInformation();
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			if (resolve)
				return getInfoReceiver();
			return basicGetInfoReceiver();
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			if (resolve)
				return getInfoSender();
			return basicGetInfoSender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.INFO_FLOW__INFORMATION:
			getInformation().clear();
			getInformation().addAll((Collection<? extends Information>) newValue);
			return;
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			setInfoReceiver((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			setInfoSender((tau.systemengineering.STPAsec.System) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.INFO_FLOW__INFORMATION:
			getInformation().clear();
			return;
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			setInfoReceiver((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			setInfoSender((tau.systemengineering.STPAsec.System) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case STPAsecPackage.INFO_FLOW__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.INFO_FLOW__INFORMATION:
			return information != null && !information.isEmpty();
		case STPAsecPackage.INFO_FLOW__INFO_RECEIVER:
			return infoReceiver != null;
		case STPAsecPackage.INFO_FLOW__INFO_SENDER:
			return infoSender != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //InfoFlowImpl
