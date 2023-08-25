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
import tau.systemengineering.STPAsec.Feedback;
import tau.systemengineering.STPAsec.FeedbackFlow;
import tau.systemengineering.STPAsec.STPAsecPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl#getId <em>Id</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl#getFeedbackSender <em>Feedback Sender</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl#getFeedbackReceiver <em>Feedback Receiver</em>}</li>
 *   <li>{@link tau.systemengineering.STPAsec.impl.FeedbackFlowImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackFlowImpl extends MinimalEObjectImpl.Container implements FeedbackFlow {
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
	 * The cached value of the '{@link #getFeedbackSender() <em>Feedback Sender</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackSender()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System feedbackSender;

	/**
	 * The cached value of the '{@link #getFeedbackReceiver() <em>Feedback Receiver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedbackReceiver()
	 * @generated
	 * @ordered
	 */
	protected tau.systemengineering.STPAsec.System feedbackReceiver;

	/**
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return STPAsecPackage.Literals.FEEDBACK_FLOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK_FLOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getFeedbackSender() {
		if (feedbackSender != null && feedbackSender.eIsProxy()) {
			InternalEObject oldFeedbackSender = (InternalEObject) feedbackSender;
			feedbackSender = (tau.systemengineering.STPAsec.System) eResolveProxy(oldFeedbackSender);
			if (feedbackSender != oldFeedbackSender) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER, oldFeedbackSender, feedbackSender));
			}
		}
		return feedbackSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetFeedbackSender() {
		return feedbackSender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedbackSender(tau.systemengineering.STPAsec.System newFeedbackSender,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldFeedbackSender = feedbackSender;
		feedbackSender = newFeedbackSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER, oldFeedbackSender, newFeedbackSender);
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
	public void setFeedbackSender(tau.systemengineering.STPAsec.System newFeedbackSender) {
		if (newFeedbackSender != feedbackSender) {
			NotificationChain msgs = null;
			if (feedbackSender != null)
				msgs = ((InternalEObject) feedbackSender).eInverseRemove(this, STPAsecPackage.SYSTEM__SENDS_FEEDBACK,
						tau.systemengineering.STPAsec.System.class, msgs);
			if (newFeedbackSender != null)
				msgs = ((InternalEObject) newFeedbackSender).eInverseAdd(this, STPAsecPackage.SYSTEM__SENDS_FEEDBACK,
						tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetFeedbackSender(newFeedbackSender, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER,
					newFeedbackSender, newFeedbackSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System getFeedbackReceiver() {
		if (feedbackReceiver != null && feedbackReceiver.eIsProxy()) {
			InternalEObject oldFeedbackReceiver = (InternalEObject) feedbackReceiver;
			feedbackReceiver = (tau.systemengineering.STPAsec.System) eResolveProxy(oldFeedbackReceiver);
			if (feedbackReceiver != oldFeedbackReceiver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER, oldFeedbackReceiver, feedbackReceiver));
			}
		}
		return feedbackReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tau.systemengineering.STPAsec.System basicGetFeedbackReceiver() {
		return feedbackReceiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeedbackReceiver(tau.systemengineering.STPAsec.System newFeedbackReceiver,
			NotificationChain msgs) {
		tau.systemengineering.STPAsec.System oldFeedbackReceiver = feedbackReceiver;
		feedbackReceiver = newFeedbackReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER, oldFeedbackReceiver, newFeedbackReceiver);
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
	public void setFeedbackReceiver(tau.systemengineering.STPAsec.System newFeedbackReceiver) {
		if (newFeedbackReceiver != feedbackReceiver) {
			NotificationChain msgs = null;
			if (feedbackReceiver != null)
				msgs = ((InternalEObject) feedbackReceiver).eInverseRemove(this,
						STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK, tau.systemengineering.STPAsec.System.class, msgs);
			if (newFeedbackReceiver != null)
				msgs = ((InternalEObject) newFeedbackReceiver).eInverseAdd(this,
						STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK, tau.systemengineering.STPAsec.System.class, msgs);
			msgs = basicSetFeedbackReceiver(newFeedbackReceiver, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER,
					newFeedbackReceiver, newFeedbackReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectResolvingEList<Feedback>(Feedback.class, this,
					STPAsecPackage.FEEDBACK_FLOW__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			if (feedbackSender != null)
				msgs = ((InternalEObject) feedbackSender).eInverseRemove(this, STPAsecPackage.SYSTEM__SENDS_FEEDBACK,
						tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetFeedbackSender((tau.systemengineering.STPAsec.System) otherEnd, msgs);
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			if (feedbackReceiver != null)
				msgs = ((InternalEObject) feedbackReceiver).eInverseRemove(this,
						STPAsecPackage.SYSTEM__RECEIVES_FEEDBACK, tau.systemengineering.STPAsec.System.class, msgs);
			return basicSetFeedbackReceiver((tau.systemengineering.STPAsec.System) otherEnd, msgs);
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
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			return basicSetFeedbackSender(null, msgs);
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			return basicSetFeedbackReceiver(null, msgs);
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
		case STPAsecPackage.FEEDBACK_FLOW__ID:
			return getId();
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			if (resolve)
				return getFeedbackSender();
			return basicGetFeedbackSender();
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			if (resolve)
				return getFeedbackReceiver();
			return basicGetFeedbackReceiver();
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK:
			return getFeedback();
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
		case STPAsecPackage.FEEDBACK_FLOW__ID:
			setId((Integer) newValue);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			setFeedbackSender((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			setFeedbackReceiver((tau.systemengineering.STPAsec.System) newValue);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK:
			getFeedback().clear();
			getFeedback().addAll((Collection<? extends Feedback>) newValue);
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
		case STPAsecPackage.FEEDBACK_FLOW__ID:
			setId(ID_EDEFAULT);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			setFeedbackSender((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			setFeedbackReceiver((tau.systemengineering.STPAsec.System) null);
			return;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK:
			getFeedback().clear();
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
		case STPAsecPackage.FEEDBACK_FLOW__ID:
			return id != ID_EDEFAULT;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_SENDER:
			return feedbackSender != null;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK_RECEIVER:
			return feedbackReceiver != null;
		case STPAsecPackage.FEEDBACK_FLOW__FEEDBACK:
			return feedback != null && !feedback.isEmpty();
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

} //FeedbackFlowImpl
