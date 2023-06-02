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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import tau.systemengineering.STPAsec.ControlAction;
import tau.systemengineering.STPAsec.Controller;
import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.ControlActionImpl#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlActionImpl extends DataFlowImpl implements ControlAction {
	/**
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Controller receiver;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getReceiver() {
		if (receiver != null && receiver.eIsProxy()) {
			InternalEObject oldReceiver = (InternalEObject) receiver;
			receiver = (Controller) eResolveProxy(oldReceiver);
			if (receiver != oldReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, STPAsecPackage.CONTROL_ACTION__RECEIVER,
							oldReceiver, receiver));
			}
		}
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Controller newReceiver, NotificationChain msgs) {
		Controller oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.CONTROL_ACTION__RECEIVER, oldReceiver, newReceiver);
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
	public void setReceiver(Controller newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject) receiver).eInverseRemove(this, STPAsecPackage.CONTROLLER__COMMANDS,
						Controller.class, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject) newReceiver).eInverseAdd(this, STPAsecPackage.CONTROLLER__COMMANDS,
						Controller.class, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.CONTROL_ACTION__RECEIVER, newReceiver,
					newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectWithInverseResolvingEList.ManyInverse<Hazard>(Hazard.class, this,
					STPAsecPackage.CONTROL_ACTION__HAZARDS, STPAsecPackage.HAZARD__UNSAFE_CONTROL_ACTIONS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			if (receiver != null)
				msgs = ((InternalEObject) receiver).eInverseRemove(this, STPAsecPackage.CONTROLLER__COMMANDS,
						Controller.class, msgs);
			return basicSetReceiver((Controller) otherEnd, msgs);
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHazards()).basicAdd(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			return basicSetReceiver(null, msgs);
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return ((InternalEList<?>) getHazards()).basicRemove(otherEnd, msgs);
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
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			if (resolve)
				return getReceiver();
			return basicGetReceiver();
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return getHazards();
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
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			setReceiver((Controller) newValue);
			return;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			getHazards().clear();
			getHazards().addAll((Collection<? extends Hazard>) newValue);
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
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			setReceiver((Controller) null);
			return;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			getHazards().clear();
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
		case STPAsecPackage.CONTROL_ACTION__RECEIVER:
			return receiver != null;
		case STPAsecPackage.CONTROL_ACTION__HAZARDS:
			return hazards != null && !hazards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlActionImpl
