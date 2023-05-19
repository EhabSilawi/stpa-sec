/**
 */
package tau.systemengineering.STPAsec.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tau.systemengineering.STPAsec.Hazard;
import tau.systemengineering.STPAsec.STPAsecPackage;
import tau.systemengineering.STPAsec.UnsafeControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unsafe Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.UnsafeControlActionImpl#getHazard <em>Hazard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnsafeControlActionImpl extends ControlActionImpl implements UnsafeControlAction {
	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected Hazard hazard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnsafeControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.UNSAFE_CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard getHazard() {
		if (hazard != null && hazard.eIsProxy()) {
			InternalEObject oldHazard = (InternalEObject) hazard;
			hazard = (Hazard) eResolveProxy(oldHazard);
			if (hazard != oldHazard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD, oldHazard, hazard));
			}
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard basicGetHazard() {
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazard(Hazard newHazard) {
		Hazard oldHazard = hazard;
		hazard = newHazard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD,
					oldHazard, hazard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD:
			if (resolve)
				return getHazard();
			return basicGetHazard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD:
			setHazard((Hazard) newValue);
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
		case STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD:
			setHazard((Hazard) null);
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
		case STPAsecPackage.UNSAFE_CONTROL_ACTION__HAZARD:
			return hazard != null;
		}
		return super.eIsSet(featureID);
	}

} //UnsafeControlActionImpl
