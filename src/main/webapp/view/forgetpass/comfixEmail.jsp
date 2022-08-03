<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/assets/css/passmabaomat.css">

</head>
<body>
	<div class="_4-u5 _30ny" style="margin-top: 196px;">
		<form:form rel="async" method="post" action="/account/accountcapcha" onsubmit="" id="u_0_a_VN">
			<div class="mtl mbm ptm uiInterstitial _9np_ uiInterstitialLarge uiBoxWhite" id="initiate_interstitial">
				<div class="uiHeader uiHeaderBottomBorder mhl mts uiHeaderPage interstitialHeader">
					<div class="clearfix uiHeaderTop">
						<div class="rfloat _ohf">
							<div class="uiHeaderActions"></div>
						</div>
						<div>
							<h2 class="uiHeaderTitle" aria-hidden="true">Đặt lại mật khẩu của bạn</h2>
						</div>
					</div>
				</div>
				<div class="phl ptm uiInterstitialContent">
					<div class="pam hidden_elem uiBoxRed" id="openid_error"></div>
					<div class="mvm"></div>
					<table class="">
					<tbody>
						<tr>
							<td class="_9o49">
								<div class="_9nq2 _9o4b">Bạn muốn nhận mã để đặt lại mật khẩu bằng cách nào?</div>
								<table class="">
									<tbody>
										<tr>
											<td valign="top" class="_k1 _9o4f">
												<label>
													<div class="uiInputLabel clearfix uiInputLabelLegacy">
														<input type="radio" id="send_email" name="recover_method" value="send_email" checked="1" class="uiInputLabelInput uiInputLabelRadio">
														<label for="send_email" class="uiInputLabelLabel">
															<div class="marginLeft12px">
																<div class="_9o1x marginBottom4px" style="margin-left: 30px;">Gửi mã qua email</div>
																<div class="_9o1y">
																	<div>${email}</div>
																</div>
															</div>
														</label>
													</div>
												</label>
											</td>
										</tr>
									</tbody>
								</table>
							</td>
							<td class="_13dd"></td>
						</tr></tbody>
					</table>
				</div>
				<div class="hu uiInterstitialBar uiBoxGray topborder" style="margin-bottom: 11px; margin-bottom: 19px;">
					<div class="clearfix">
						<div  class="rfloat _ohf" style="margin-left: 205px;">
							<a  role="button" class="_42ft _4jy0 _9nq1 textPadding13px _4jy3 _517h _51sy" name="reset_action" href="../oe/forgetpass">Không phải là bạn?</a>
							<button value="1" class="_42ft _4jy0 _9nq0 textPadding20px _4jy3 _4jy1 selected _51sy" name="reset_action" type="submit">Tiếp tục</button>
						</div>
						<div style="margin-top: -30px;" class="pts">
							<a class="_9o1v"  href="">Không còn truy cập được nữa?</a>
						</div>
					</div>
				</div>
			</div>
		</form:form>
	</div>
	</body>
</html>