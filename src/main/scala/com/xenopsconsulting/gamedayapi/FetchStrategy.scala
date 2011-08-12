package com.xenopsconsulting.gamedayapi

import xml.Elem

trait FetchStrategy {
  def fetch: Elem
}